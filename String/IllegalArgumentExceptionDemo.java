// Q7: Demonstrate IllegalArgumentException
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException (unhandled)
    static void generateException(String s) {
        // This will throw StringIndexOutOfBoundsException, which is a subclass of IllegalArgumentException
        System.out.println("This will cause an exception:");
        System.out.println(s.substring(5, 2)); // start > end
    }

    // Method to handle IllegalArgumentException using try-catch
    static void handleException(String s) {
        try {
            System.out.println("Trying to get substring with start > end:");
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // 1. Call method to generate exception (unhandled, will stop program)
        // Uncomment below line to see abrupt stop
        // generateException(input);
        // 2. Call method to handle exception
        handleException(input);
        sc.close();
    }
}
