// DigitArrayOperations.java
// Utility class for digit array operations (reverse, compare, palindrome, duck)
import java.util.Arrays;

public class DigitArrayOperations {
    // Find the count of digits in the number
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
    // Store the digits of the number in an array
    public static int[] getDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    // Reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }
    // Compare two arrays for equality
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    // Check if a number is palindrome using digits
    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        int[] rev = reverseArray(digits);
        return arraysEqual(digits, rev);
    }
    // Check if a number is a duck number (contains zero)
    public static boolean isDuckNumber(int n) {
        int[] digits = getDigits(n);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 12021; // Sample number
        System.out.println("Digits: " + Arrays.toString(getDigits(n)));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(getDigits(n))));
        System.out.println("Is palindrome: " + isPalindrome(n));
        System.out.println("Is duck number: " + isDuckNumber(n));
    }
}
