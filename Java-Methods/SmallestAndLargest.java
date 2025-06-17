import java.util.Scanner;
/**
 * SmallestAndLargest.java
 * Finds the smallest and largest of three numbers.
 */
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // find the largest element
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
        int[] sl = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + sl[0] + ", Largest: " + sl[1]);
        sc.close();
    }
}
