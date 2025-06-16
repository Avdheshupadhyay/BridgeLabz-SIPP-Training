import java.util.Scanner;

/**
 * Program FizzBuzz: Takes a number as user input and fills an array with numbers from 1 to n,
 * but for multiples of 3 saves "Fizz", for multiples of 5 saves "Buzz", and for multiples of both saves "FizzBuzz".
 * Prints the array results for each index position in the format Position 1 = ..., Position 2 = ...
 */
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            scanner.close();
            return;
        }
        String[] results = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i-1] = "Buzz";
            } else {
                results[i-1] = Integer.toString(i);
            }
        }
        // Print the results
        for (int i = 0; i < n; i++) {
            System.out.println("Position " + (i+1) + " = " + results[i]);
        }
        scanner.close();
    }
}
