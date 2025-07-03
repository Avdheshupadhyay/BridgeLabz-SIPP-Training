import java.util.ArrayList;
import java.util.List;

public class ECommerceMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product tv = new Electronics(101, "LED TV", 30000, 2);
        Product shirt = new Clothing(102, "Shirt", 2000, "L");
        Product apple = new Groceries(103, "Apple", 150, "2025-07-10");

        products.add(tv);
        products.add(shirt);
        products.add(apple);

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            if (p instanceof Taxable) {
                System.out.println(((Taxable)p).getTaxDetails() + ": " + tax);
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---");
        }
    }
}
