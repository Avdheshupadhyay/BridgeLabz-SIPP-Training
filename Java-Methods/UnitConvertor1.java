// UnitConvertor1.java
// Utility class for various unit conversions (yards/feet/meters/inches/centimeters)
public class UnitConvertor1 {
    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    // Example usage
    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("30 feet to yards: " + convertFeetToYards(30));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("100 inches to meters: " + convertInchesToMeters(100));
        System.out.println("50 inches to centimeters: " + convertInchesToCentimeters(50));
    }
}
