import java.util.Scanner;

/**
 * Program to save odd and even numbers into separate arrays between 1 to the number entered by the user.
 * Finally, prints the odd and even numbers arrays.
 */
public class OddEvenArraySplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            scanner.close();
            return;
        }
        int size = number / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oddIndex = 0, evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
