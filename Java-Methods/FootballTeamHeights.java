// FootballTeamHeights.java
// Program to find shortest, tallest, and mean height of football players
import java.util.Random;
import java.util.Arrays;

public class FootballTeamHeights {
    // Generate random heights for 11 players (150-250 cm)
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150-250
        }
        return heights;
    }
    // Sum of heights
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    // Mean height
    public static double mean(int[] arr) {
        return sum(arr) / (double)arr.length;
    }
    // Shortest height
    public static int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }
    // Tallest height
    public static int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }
    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
        System.out.printf("Mean height: %.2f\n", mean(heights));
    }
}
