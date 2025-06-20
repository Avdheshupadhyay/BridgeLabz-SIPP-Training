// Q20: Display character type (Vowel, Consonant, Not a Letter) for each character in string
import java.util.Scanner;

public class VowelConsonantTypeTable {
    // Check if character is vowel, consonant, or not a letter
    static String charType(char c) {
        char lc = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
        if (lc >= 'a' && lc <= 'z') {
            if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // Find type for each character, return 2D array
    static String[][] charTypes(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = charType(s.charAt(i));
        }
        return arr;
    }

    // Display 2D array in tabular format
    static void displayTable(String[][] arr) {
        System.out.printf("%-10s%-15s\n", "Char", "Type");
        for (String[] row : arr) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[][] arr = charTypes(s);
        displayTable(arr);
        sc.close();
    }
}
