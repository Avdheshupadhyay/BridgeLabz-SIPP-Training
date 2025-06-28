package BuildInFunction;

import java.util.Scanner;

public class PalindromeChecker {
    static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(input + " is " + (isPalindrome(input) ? "a Palindrome" : "not a Palindrome"));
    }
}
