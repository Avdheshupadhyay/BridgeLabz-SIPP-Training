public class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        // 20% discount for clothing
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        // 5% GST
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "GST @ 5%";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
