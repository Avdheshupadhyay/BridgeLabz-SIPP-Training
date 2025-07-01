// S17. Avoid Inheriting from Concrete Classes
abstract class AbstractVehicle {
    abstract void move();
}
class Bike extends AbstractVehicle {
    @Override
    void move() { System.out.println("Bike is moving"); }
}
public class S17_AbstractOverConcrete {
    public static void main(String[] args) {
        AbstractVehicle v = new Bike();
        v.move();
    }
}
