import java.util.Scanner;
//This program calculates the discounted fee for a student based on user input.
 public class UniversityFeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + 
                         " and final discounted fee is INR " + finalFee);

        input.close();
    }
}