import java.util.Scanner;

/**
 * Program to take user input for 5 numbers and check whether each number is positive, negative, or zero.
 * For positive numbers, checks if the number is even or odd.
 * Finally, compares the first and last elements of the array and displays if they are equal, greater, or less.
 */
public class NumberSignEvenOddCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Process each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is ");
            if (numbers[i] > 0) {
                // Positive number
                if (numbers[i] % 2 == 0) {
                    System.out.println("positive and even.");
                } else {
                    System.out.println("positive and odd.");
                }
            } else if (numbers[i] < 0) {
                // Negative number
                System.out.println("negative.");
            } else {
                // Zero
                System.out.println("zero.");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("First element (" + first + ") is ");
        if (first == last) {
            System.out.println("equal to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("greater than last element (" + last + ").");
        } else {
            System.out.println("less than last element (" + last + ").");
        }
        scanner.close();
    }
}
