import java.util.Scanner;

/**
 * Program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number.
 * Shows all the numbers as well as the sum of all numbers.
 */
public class ArrayInputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index++] = num;
        }
        // Show all numbers
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println();
        System.out.println("Sum of all numbers: " + total);
        scanner.close();
    }
}
