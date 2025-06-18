// DigitArrayAdvanced.java
// Utility class for digit count, duck, armstrong, largest/smallest in digits
import java.util.Arrays;

public class DigitArrayAdvanced {
    // Count digits
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
    // Store digits in array
    public static int[] getDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }
    // Duck number
    public static boolean isDuckNumber(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) if (d == 0) return true;
        return false;
    }
    // Armstrong number
    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int sum = 0, pow = digits.length;
        for (int d : digits) sum += Math.pow(d, pow);
        return sum == n;
    }
    // Largest and second largest
    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) { max2 = max1; max1 = d; }
            else if (d > max2 && d != max1) max2 = d;
        }
        return new int[]{max1, max2};
    }
    // Smallest and second smallest
    public static int[] smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) { min2 = min1; min1 = d; }
            else if (d < min2 && d != min1) min2 = d;
        }
        return new int[]{min1, min2};
    }
    public static void main(String[] args) {
        int n = 153;
        int[] digits = getDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is duck number: " + isDuckNumber(n));
        System.out.println("Is Armstrong: " + isArmstrong(n));
        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
