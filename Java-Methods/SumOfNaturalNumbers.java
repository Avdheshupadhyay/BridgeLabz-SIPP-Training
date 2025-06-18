import java.util.Scanner;
/**
 * SumOfNaturalNumbers.java
 * Calculates the sum of n natural numbers using a loop.
 */
public class SumOfNaturalNumbers {
    /**
     * Recursive method to compute sum of n natural numbers
     */
    public static int sumRecursive(int n) {
        if (n <= 0) return 0;
        return n + sumRecursive(n - 1);
    }

    /**
     * Formula-based method to compute sum of n natural numbers
     */
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0)");
        } else {
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);
            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumForm);
            if (sumRec == sumForm) {
                System.out.println("Both results match. Computation is correct.");
            } else {
                System.out.println("Results do not match. Please check the logic.");
            }
        }
        sc.close();
    }
}

