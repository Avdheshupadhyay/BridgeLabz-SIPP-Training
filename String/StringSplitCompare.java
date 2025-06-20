// Q15: Split text into words, compare with split()
import java.util.Scanner;

public class StringSplitCompare {
    // Find string length without using length()
    static int manualLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Split string into words without split()
    static String[] manualSplit(String s) {
        int len = manualLength(s);
        int wordCount = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') wordCount++;
        int[] spaces = new int[wordCount + 1];
        int idx = 0;
        spaces[idx++] = -1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') spaces[idx++] = i;
        spaces[idx] = len;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = s.substring(spaces[i]+1, spaces[i+1]);
        }
        return words;
    }

    // Compare two string arrays
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[] builtIn = s.split(" ");
        String[] manual = manualSplit(s);
        boolean same = compareArrays(builtIn, manual);
        System.out.println("Manual split: ");
        for (String w : manual) System.out.println(w);
        System.out.println("Built-in split: ");
        for (String w : builtIn) System.out.println(w);
        System.out.println("Are both splits equal? " + same);
        sc.close();
    }
}
