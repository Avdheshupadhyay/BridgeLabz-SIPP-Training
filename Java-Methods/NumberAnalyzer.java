// NumberAnalyzer.java
// Program to analyze 5 numbers: check positive/negative, even/odd, and compare first and last elements
import java.util.Scanner;

public class NumberAnalyzer {
    // Method to check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if n1 > n2, 0 if equal, -1 if n1 < n2
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
        sc.close();
    }
}
