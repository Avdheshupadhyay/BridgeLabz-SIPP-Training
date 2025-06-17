import java.util.Scanner;
/**
 * QuotientAndRemainder.java
 * Finds the quotient and remainder of two integers.
 */
public class QuotientAndRemainder {
  
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate the quotient using division operator
        int quotient = number / divisor;
        // Calculate the remainder using modulus operator
        int remainder = number % divisor;
        // Return both values in an array
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Prompt user to enter the number (dividend)
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        // Prompt user to enter the divisor
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        // Call the method to get quotient and remainder
        int[] qr = findRemainderAndQuotient(number, divisor);
        // Print the results
        System.out.println("Quotient: " + qr[0] + ", Remainder: " + qr[1]);
        // Close the scanner
        sc.close();
    }
}
