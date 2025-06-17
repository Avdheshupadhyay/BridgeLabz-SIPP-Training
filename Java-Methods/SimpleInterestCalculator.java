import java.util.Scanner;
/**
 * SimpleInterestCalculator.java
 * Calculates simple interest given principal, rate, and time.
 */
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // apply Simple interest formula
        return (principal * rate * time) / 100.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();
        // call the method
        double si = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n", si, principal, rate, time);
        sc.close();
    }
}
