import java.util.Scanner;
/**
 * TrigonometricFunctions.java
 * Calculates sine, cosine, and tangent for a given angle in degrees.
 */
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        // calculate the answer using math 
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        // call the method
        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f, Cosine: %.4f, Tangent: %.4f\n", trig[0], trig[1], trig[2]);
        sc.close();
    }
}
