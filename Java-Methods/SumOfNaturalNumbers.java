import java.util.Scanner;
/**
 * SumOfNaturalNumbers.java
 * Calculates the sum of n natural numbers using a loop.
 */
public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // iterate over the loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // call the method
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        sc.close();
    }
}
