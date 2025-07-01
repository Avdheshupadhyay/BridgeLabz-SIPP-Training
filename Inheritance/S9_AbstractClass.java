// S9. Prefer Abstract Classes for Partial Implementation
abstract class Appliance {
    abstract void turnOn();
    void plugIn() { System.out.println("Plugged in"); }
}
class Fan extends Appliance {
    @Override
    void turnOn() { System.out.println("Fan is spinning"); }
}
public class S9_AbstractClass {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.plugIn();
        f.turnOn();
    }
}
