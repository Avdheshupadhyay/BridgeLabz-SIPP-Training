import java.util.Scanner;

/**
 * Program to take a number as input and display the number in reverse order by
 * storing its digits in an array and then printing the array in reverse
 * sequence.
 */
public class ReverseNumberArray {
    /**
     * Main method – entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Negative numbers are not supported.");
            scanner.close();
            return;
        }

        // Convert the number to String to easily determine its length
        String numStr = String.valueOf(number);
        int length = numStr.length();
        int[] digits = new int[length];

        // Store each digit in the array
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        // Display the number in reverse order using the digits array
        System.out.print("Reversed number: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
