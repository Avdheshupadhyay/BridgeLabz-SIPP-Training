// EuclideanAndLine.java
// Program to compute Euclidean distance and equation of the line between two points
import java.util.Scanner;

public class EuclideanAndLine {
    // Method to find the Euclidean distance between two points
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line (slope and y-intercept) given two points
    // Returns double[]{slope, yIntercept}
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) throw new IllegalArgumentException("Slope is undefined for vertical lines.");
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance: %.3f\n", distance);
        try {
            double[] eq = lineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of line: y = %.3fx + %.3f\n", eq[0], eq[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
