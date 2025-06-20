// Q11: Voting eligibility for 10 students
import java.util.*;

public class VotingEligibility {
    // Generate random 2-digit ages for n students
    static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10; // 10 to 91
        }
        return ages;
    }

    // Returns 2D String array: [age, canVote]
    static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    // Display 2D array in tabular format
    static void displayTable(String[][] arr) {
        System.out.printf("%-10s%-10s\n", "Age", "CanVote");
        for (String[] row : arr) {
            System.out.printf("%-10s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] table = checkEligibility(ages);
        displayTable(table);
        sc.close();
    }
}
