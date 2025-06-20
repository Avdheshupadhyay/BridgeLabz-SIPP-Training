// Q14: Find string length without using length() method
import java.util.Scanner;

public class StringLengthNoLength {
    // Method to find length without using length()
    static int manualLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception when index out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        int lenManual = manualLength(s);
        int lenBuiltIn = s.length();
        System.out.println("Manual length: " + lenManual);
        System.out.println("Built-in length: " + lenBuiltIn);
        sc.close();
    }
}
