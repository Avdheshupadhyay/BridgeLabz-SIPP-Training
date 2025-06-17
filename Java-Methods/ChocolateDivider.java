import java.util.Scanner;
/**
 * ChocolateDivider.java
 * Divides chocolates among children and prints the result.
 */
public class ChocolateDivider {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // apply the mathematically formula
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  take the input from user
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        // call the method
        int[] ch = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + ch[0] + ", Remaining chocolates: " + ch[1]);
        sc.close();
    }
}
