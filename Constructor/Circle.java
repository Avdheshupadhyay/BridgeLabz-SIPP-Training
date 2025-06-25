// Circle.java
// Class with radius; constructor chaining for default and user-provided values
public class Circle {
    private double radius;

    public Circle() {
        this(1.0); // default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}
