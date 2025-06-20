// Q18: Find vowels and consonants count in a string
import java.util.Scanner;

public class VowelConsonantCount {
    // Check if character is vowel, consonant, or not a letter
    static String charType(char c) {
        char lc = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
        if (lc >= 'a' && lc <= 'z') {
            if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // Find vowels and consonants count
    static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            String type = charType(s.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int[] counts = countVowelsConsonants(s);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        sc.close();
    }
}
