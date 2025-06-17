import java.util.Scanner;   

public class UnitConverter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble(); // Take input
        System.out.println("In Celsius: " + convertFahrenheitToCelsius(fahrenheit)); // Call method and print

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("In Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        // Pounds to Kilograms
        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("In Kilograms: " + convertPoundsToKilograms(pounds));

        // Kilograms to Pounds
        System.out.print("Enter weight in Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("In Pounds: " + convertKilogramsToPounds(kilograms));

        // Gallons to Liters
        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("In Liters: " + convertGallonsToLiters(gallons));

        // Liters to Gallons
        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println("In Gallons: " + convertLitersToGallons(liters));

        sc.close(); // Close scanner object (good practice)
    }
}
