public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        // 10% discount for veg items
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% Veg Discount";
    }
}
