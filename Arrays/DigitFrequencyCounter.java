import java.util.Scanner;

/**
 * Program to take a number as input and display the frequency of each digit
 * using an array.
 */
public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Negative numbers are not supported.");
            scanner.close();
            return;
        }

        // Frequency array where index represents the digit 0-9
        int[] freq = new int[10];

        // Handle the special case when number is 0
        if (number == 0) {
            freq[0] = 1;
        } else {
            while (number > 0) {
                int digit = (int) (number % 10);
                freq[digit]++;
                number /= 10;
            }
        }

        // Display the frequencies
        System.out.println("Digit -> Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }

        scanner.close();
    }
}
