// DigitSumOperations.java
// Utility class for digit sum, sum of squares, Harshad, digit frequency
import java.util.Arrays;

public class DigitSumOperations {
    // Store the digits of the number in an array
    public static int[] getDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }
    // Find the sum of digits
    public static int sumOfDigits(int n) {
        int[] digits = getDigits(n);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }
    // Find the sum of squares of digits
    public static int sumOfSquaresOfDigits(int n) {
        int[] digits = getDigits(n);
        int sum = 0;
        for (int d : digits) sum += (int)Math.pow(d, 2);
        return sum;
    }
    // Check if a number is Harshad
    public static boolean isHarshad(int n) {
        int sum = sumOfDigits(n);
        return n % sum == 0;
    }
    // Find the frequency of each digit in the number
    public static int[][] digitFrequency(int n) {
        int[] digits = getDigits(n);
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        int[][] result = new int[count][2];
        int idx = 0;
        for (int d = 0; d < 10; d++) {
            if (freq[d] > 0) {
                result[idx][0] = d;
                result[idx][1] = freq[d];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 21221; // Sample number
        System.out.println("Sum of digits: " + sumOfDigits(n));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(n));
        System.out.println("Is Harshad: " + isHarshad(n));
        System.out.println("Digit frequencies:");
        int[][] freq = digitFrequency(n);
        for (int[] row : freq) {
            System.out.println("Digit " + row[0] + ": " + row[1]);
        }
    }
}
