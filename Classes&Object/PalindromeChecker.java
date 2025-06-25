// PalindromeChecker.java
// Checks if a given text is a palindrome.

public class PalindromeChecker {
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Getter and Setter
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
