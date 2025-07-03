public class Electronics extends Product implements Taxable {
    private double warrantyYears;

    public Electronics(int productId, String name, double price, double warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        // 10% discount for electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 18% GST
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST @ 18%";
    }

    public double getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(double warrantyYears) {
        if (warrantyYears < 0) {
            throw new IllegalArgumentException("Warranty years must be positive");
        }
        this.warrantyYears = warrantyYears;
    }
}
