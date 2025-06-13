import java.util.Scanner;
//This program converts height in centimeters to feet and inches.
public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm to inches (1 inch = 2.54 cm)
        double heightInches = heightCm / 2.54;

        // Convert inches to feet (1 foot = 12 inches)
        double feet = (int)(heightInches / 12);
        double remainingInches = heightInches % 12;

        // Output the result
        System.out.println("Your Height in cm is " + heightCm + 
                         " while in feet is " + feet + " and inches is " + remainingInches);

        input.close();
    }
}