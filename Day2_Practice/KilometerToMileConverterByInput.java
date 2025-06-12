import java.util.Scanner;
// This program converts a given distance in kilometers to miles.
 public class KilometerToMileConverterByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}