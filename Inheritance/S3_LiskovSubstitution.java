// S3. Follow Liskov Substitution Principle
// Subclasses should be usable wherever superclass is expected
class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    @Override
    int area() { return 25; }
}
public class S3_LiskovSubstitution {
    public static void main(String[] args) {
        Shape s = new Square();
        System.out.println("Area: " + s.area()); // Works for any Shape
    }
}
