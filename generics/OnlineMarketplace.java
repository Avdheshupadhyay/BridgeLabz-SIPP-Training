abstract class CategoryDetails {
    public abstract String getDetails();
}

// Electronics-specific details
class ElectronicsDetails extends CategoryDetails {
    int warrantyMonths;

    public ElectronicsDetails(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDetails() {
        return "Warranty: " + warrantyMonths + " months";
    }
}

// Clothing-specific details
class ClothingDetails extends CategoryDetails {
    String size;

    public ClothingDetails(String size) {
        this.size = size;
    }

    @Override
    public String getDetails() {
        return "Size: " + size;
    }
}

// Grocery-specific details
class GroceryDetails extends CategoryDetails {
    String expiryDate;

    public GroceryDetails(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Expiry: " + expiryDate;
    }
}

// Generic Product class
class Product<T extends CategoryDetails> {
    String name;
    double price;
    T categoryDetails;

    public Product(String name, double price, T categoryDetails) {
        this.name = name;
        this.price = price;
        this.categoryDetails = categoryDetails;
    }

    public void display() {
        System.out.println(name + " | ₹" + price + " | " + categoryDetails.getDetails());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Utility class with generic method
class MarketplaceUtils {
    // Generic method to apply discount
    public static <T extends CategoryDetails> void applyDiscount(Product<T> product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(Math.round(newPrice * 100.0) / 100.0);  // round to 2 decimals
    }
}

// Main class
public class OnlineMarketplace {
    public static void main(String[] args) {
        // Create products
        Product<ElectronicsDetails> laptop = new Product<>("Laptop", 75000, new ElectronicsDetails(24));
        Product<ClothingDetails> tshirt = new Product<>("T-Shirt", 999, new ClothingDetails("L"));
        Product<GroceryDetails> milk = new Product<>("Milk", 60, new GroceryDetails("2025-08-05"));

        // Display original prices
        System.out.println("== Before Discount ==");
        laptop.display();
        tshirt.display();
        milk.display();

        // Apply discount using generic method
        MarketplaceUtils.applyDiscount(laptop, 10);  // 10% off
        MarketplaceUtils.applyDiscount(tshirt, 20);  // 20% off
        MarketplaceUtils.applyDiscount(milk, 5);     // 5% off

        // Display after discount
        System.out.println("\n== After Discount ==");
        laptop.display();
        tshirt.display();
        milk.display();
    }
}
