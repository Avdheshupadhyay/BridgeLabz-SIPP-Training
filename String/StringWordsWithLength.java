// Q16: Split text into words and return words with their lengths
import java.util.Scanner;

public class StringWordsWithLength {
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

    // Return 2D array: word and its length
    static String[][] wordsWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(manualLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[] words = manualSplit(s);
        String[][] arr = wordsWithLength(words);
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        for (String[] row : arr) {
            System.out.printf("%-15s%-10s\n", row[0], Integer.parseInt(row[1]));
        }
        sc.close();
    }
}
