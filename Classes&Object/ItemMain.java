// ItemMain.java
// Test class for Item

public class ItemMain {
    public static void main(String[] args) {
        Item item = new Item(201, "Notebook", 50.0);
        item.displayDetails();
        int quantity = 5;
        System.out.println("Total cost for " + quantity + " items: Rs. " + item.calculateTotalCost(quantity));
    }
}
