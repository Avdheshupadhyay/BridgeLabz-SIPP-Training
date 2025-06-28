package BuildInFunction;

import java.util.Scanner;

public class TemperatureConverter {
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Convert to (C/F)? ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + toCelsius(f));
        } else {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + toFahrenheit(c));
        }
    }
}
