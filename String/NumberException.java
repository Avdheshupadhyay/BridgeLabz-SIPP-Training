import java.util.*;

public class NumberException {
    public static void main(String[] args) {
        // take input
        System.out.println("Enter the text:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        try {
            // if text is numeric
            int ans = Integer.parseInt(str);  
            System.out.println("The numeric value extracted from text: " + ans);
        } catch (NumberFormatException e) {
            // if text is contains characters
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
