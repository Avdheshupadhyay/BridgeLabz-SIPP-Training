// Q13: Student scorecard with grades
import java.util.*;

public class StudentScorecard {
    // Generate random 2-digit scores for PCM
    static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(51) + 50; // 50-100
            }
        }
        return scores;
    }

    // Calculate total, average, percentage
    static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    // Calculate grade based on percentage
    static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 80) grades[i] = "B";
            else if (percent >= 70) grades[i] = "C";
            else if (percent >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    // Display scorecard
    static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "%", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%-10s\n", i+1, scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
        sc.close();
    }
}
