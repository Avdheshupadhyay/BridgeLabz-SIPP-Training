// Q8: Convert text to uppercase and compare results
import java.util.Scanner;

public class UppercaseCompare {
    // Convert each lowercase character to uppercase using ASCII logic
    static String toUpperManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Compare two strings character by character
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String upperBuiltIn = input.toUpperCase();
        String upperManual = toUpperManual(input);
        boolean areEqual = compareStrings(upperBuiltIn, upperManual);
        System.out.println("Manual Uppercase: " + upperManual);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + areEqual);
        sc.close();
    }
}
