// Q17: Trim leading and trailing spaces using charAt()
import java.util.Scanner;

public class TrimStringManual {
    // Find start and end index without spaces
    static int[] trimIndices(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    // Manual substring using charAt
    static String manualSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    // Compare two strings using charAt
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String s = sc.nextLine();
        int[] idx = trimIndices(s);
        String trimmedManual = (idx[1] >= idx[0]) ? manualSubstring(s, idx[0], idx[1]) : "";
        String trimmedBuiltIn = s.trim();
        boolean same = compareStrings(trimmedManual, trimmedBuiltIn);
        System.out.println("Manual trim: '" + trimmedManual + "'");
        System.out.println("Built-in trim: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trims equal? " + same);
        sc.close();
    }
}
