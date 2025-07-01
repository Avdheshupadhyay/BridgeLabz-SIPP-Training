// S1. Favor Composition Over Inheritance
// Example: Car has-an Engine (composition), not Car extends Engine
class Engine {
    void start() { System.out.println("Engine started."); }
}
class Car {
    private Engine engine = new Engine(); // Composition
    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
