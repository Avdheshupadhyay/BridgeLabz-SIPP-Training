import java.util.*;

// Base abstract class
abstract class WarehouseItem {
    String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}

// Electronics class
class Electronics extends WarehouseItem {
    int warrantyMonths;

    public Electronics(String name, int warrantyMonths) {
        super(name);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + " | Warranty: " + warrantyMonths + " months");
    }
}

// Groceries class
class Groceries extends WarehouseItem {
    String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries: " + name + " | Expiry Date: " + expiryDate);
    }
}

// Furniture class
class Furniture extends WarehouseItem {
    String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + " | Material: " + material);
    }
}

// Generic Storage class with bounded type parameter
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Wildcard method to display any storage items
class WarehouseUtils {
    public static void displayItems(Storage<?> storage) {
        for (Object item : storage.getItems()) {
            ((WarehouseItem) item).displayDetails();
        }
    }
}

// Main class
public class SmartWarehouse {
    public static void main(String[] args) {
        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 24));
        electronicsStorage.addItem(new Electronics("Smartphone", 12));

        // Groceries storage
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", "2025-12-31"));
        groceriesStorage.addItem(new Groceries("Milk", "2025-08-10"));

        // Furniture storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Sofa", "Leather"));

        // Display items using wildcard
        System.out.println("== Electronics ==");
        WarehouseUtils.displayItems(electronicsStorage);

        System.out.println("\n== Groceries ==");
        WarehouseUtils.displayItems(groceriesStorage);

        System.out.println("\n== Furniture ==");
        WarehouseUtils.displayItems(furnitureStorage);
    }
}
