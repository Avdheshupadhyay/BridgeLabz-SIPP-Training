//This program calculates the discounted fee for a student based on a fixed 10% discount.
public class UniversityFeeDiscount {
    public static void main(String[] args) {
        // Given data
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + 
                         " and final discounted fee is INR " + finalFee);
    }
}