// CartItem.java
// Models a shopping cart item with add, remove, and total cost methods.

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Add items to the cart
    public void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " item(s) added to the cart.");
    }

    // Remove items from the cart
    public void removeItem(int qty) {
        if (qty <= this.quantity) {
            this.quantity -= qty;
            System.out.println(qty + " item(s) removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in cart.");
        }
    }

    // Display total cost
    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + (price * quantity));
    }
}
