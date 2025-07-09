import java.util.*;

public class PairWithGivenSum {
    // Checks if a pair with given sum exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        boolean exists = hasPairWithSum(arr, target);
        System.out.println("Pair with sum " + target + ": " + exists);
    }
}
