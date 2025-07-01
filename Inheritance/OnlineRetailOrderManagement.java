// Online Retail Order Management: Multilevel Inheritance
class Order {
    protected int orderId;
    protected String orderDate;
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() {
        return "Order placed";
    }
}
class ShippedOrder extends Order {
    protected String trackingNumber;
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() {
        return "Order shipped, Tracking: " + trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o = new Order(1, "2025-07-01");
        ShippedOrder so = new ShippedOrder(2, "2025-07-01", "TRK123");
        DeliveredOrder d = new DeliveredOrder(3, "2025-07-01", "TRK456", "2025-07-02");
        System.out.println(o.getOrderStatus());
        System.out.println(so.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
