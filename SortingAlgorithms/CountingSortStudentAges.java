// Counting Sort - Sort Student Ages
public class CountingSortStudentAges {
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            count[arr[i] - min]++;
        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 13, 17, 11};
        System.out.print("Original ages: ");
        for (int age : ages) System.out.print(age + " ");
        System.out.println();
        countingSort(ages);
        System.out.print("Sorted ages: ");
        for (int age : ages) System.out.print(age + " ");
        System.out.println();
    }
}
