import java.util.Scanner;
/**
 * TriangularParkRounds.java
 * Calculates how many rounds an athlete must run in a triangular park to complete 5 km.
 */
public class TriangularParkRounds {
   
    
    public static double calculateRounds(double a, double b, double c) {
        // Calculate the perimeter of the triangle
        double perimeter = a + b + c;
        // Total distance to be covered (5km = 5000 meters)
        double distance = 5000;
        // Number of rounds = total distance / perimeter
        return distance / perimeter;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter the length of side a
        System.out.print("Enter side a (meters): ");
        double a = sc.nextDouble();
        // Prompt the user to enter the length of side b
        System.out.print("Enter side b (meters): ");
        double b = sc.nextDouble();
        // Prompt the user to enter the length of side c
        System.out.print("Enter side c (meters): ");
        double c = sc.nextDouble();
        // Call the method to calculate the number of rounds
        double rounds = calculateRounds(a, b, c);
        // Print the result rounded to 2 decimal places
        System.out.printf("Number of rounds to complete 5km: %.2f\n", rounds);
        // Close the scanner
        sc.close();
    }
}
