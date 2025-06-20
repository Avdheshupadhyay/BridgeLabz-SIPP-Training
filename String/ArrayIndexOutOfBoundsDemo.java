// Q9: Demonstrate ArrayIndexOutOfBoundsException
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    // Method to generate ArrayIndexOutOfBoundsException (unhandled)
    static void generateException(String[] arr) {
        System.out.println("This will cause an exception:");
        System.out.println(arr[arr.length]); // Invalid index
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    static void handleException(String[] arr) {
        try {
            System.out.println("Trying to access invalid index:");
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.nextLine();
        }
        // 1. Call method to generate exception (unhandled, will stop program)
        // Uncomment below line to see abrupt stop
        // generateException(names);
        // 2. Call method to handle exception
        handleException(names);
        sc.close();
    }
}
