// CartItemMain.java
// Test class for CartItem

public class CartItemMain {
    public static void main(String[] args) {
        CartItem item = new CartItem("Pen", 10.0, 2);
        item.displayTotalCost();
        item.addItem(3);
        item.displayTotalCost();
        item.removeItem(4);
        item.displayTotalCost();
        item.removeItem(2); // Attempt to remove more than available
    }
}
