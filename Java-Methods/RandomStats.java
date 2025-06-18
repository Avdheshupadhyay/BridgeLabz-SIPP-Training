// RandomStats.java
// Program to generate 5 random 4-digit numbers and find average, min, and max
import java.util.*;

public class RandomStats {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000); // 1000 to 9999
        }
        return arr;
    }

    // Method to find average, min, and max values of an array
    // Returns double[]{average, min, max}
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double avg = sum / (double)numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit numbers: " + Arrays.toString(arr));
        double[] stats = findAverageMinMax(arr);
        System.out.printf("Average: %.2f\nMinimum: %.0f\nMaximum: %.0f\n", stats[0], stats[1], stats[2]);
    }
}
