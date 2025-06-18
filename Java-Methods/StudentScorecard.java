// StudentScorecard.java
// Program to generate and display PCM scores, total, average, percentage for students
import java.util.Random;

public class StudentScorecard {
    // Generate random 2-digit PCM scores for n students
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 10 + rand.nextInt(90); // 10-99
        return scores;
    }
    // Calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 300.0) * 10000) / 100.0;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100) / 100.0;
            results[i][2] = percent;
        }
        return results;
    }
    // Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Roll\tPhysics\tChemistry\tMaths\tTotal\tAverage\t% ");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", i+1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }
    public static void main(String[] args) {
        int n = 5; // number of students
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
