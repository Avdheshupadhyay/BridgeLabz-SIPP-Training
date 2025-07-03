import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryMain {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            System.out.println("Total Price: " + totalPrice);
            if (item instanceof Discountable) {
                System.out.println(((Discountable)item).getDiscountDetails() + ": " + discount);
            }
            System.out.println("Final Price: " + (totalPrice - discount));
            System.out.println("---");
        }
    }
}
