import java.util.Scanner;
/**
 * WindChillCalculator.java
 * Calculates the wind chill temperature based on temperature and wind speed.
 */
public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula valid for temp <= 10°C and wind speed > 4.8 km/h
        return 13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16)
                + 0.3965 * temperature * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.print("Enter temperature (°C): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (km/h): ");
        double wind = sc.nextDouble();
        // call the method
        double windChill = calculateWindChill(temp, wind);
        System.out.printf("Wind Chill Temperature: %.2f°C\n", windChill);
        sc.close();
    }
}
