import java.util.Scanner;

/**
 * Program to find the mean height of players in a football team.
 * Takes input for 11 players, calculates and prints the mean height.
 */
public class FootballMeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.printf("Mean height of the football team: %.2f\n", mean);
        scanner.close();
    }
}
