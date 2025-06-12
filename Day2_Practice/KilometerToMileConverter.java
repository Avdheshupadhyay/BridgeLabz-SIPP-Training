//This class converts a given distance in kilometers to miles.
public class KilometerToMileConverter {
    public static void main(String[] args) {
        // Given distance in km
        double kilometers = 10.8;
        // Conversion factor
        double kmToMile = 1.6;
        // Convert to miles
        double miles = kilometers / kmToMile;
        // Output the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}