// UnitConvertor2.java
// Utility class for various unit conversions (km/miles/meters/feet)
public class UnitConvertor2 {
    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    // Example usage
    public static void main(String[] args) {
        System.out.println("5 km to miles: " + convertKmToMiles(5));
        System.out.println("3 miles to km: " + convertMilesToKm(3));
        System.out.println("10 meters to feet: " + convertMetersToFeet(10));
        System.out.println("32 feet to meters: " + convertFeetToMeters(32));
    }
}
