public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // 20% extra charge for non-veg
        return getPrice() * getQuantity() * 1.2;
    }

    @Override
    public double applyDiscount() {
        // 5% discount for non-veg items
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% Non-Veg Discount";
    }
}
