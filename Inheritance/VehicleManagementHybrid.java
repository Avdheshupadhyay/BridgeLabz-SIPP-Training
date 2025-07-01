// Vehicle Management System with Hybrid Inheritance (using interface)
interface Refuelable {
    void refuel();
}
class VehicleVM {
    protected int maxSpeed;
    protected String model;
    public VehicleVM(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
class ElectricVehicle extends VehicleVM {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void charge() {
        System.out.println(model + " is charging.");
    }
}
class PetrolVehicle extends VehicleVM implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}
public class VehicleManagementHybrid {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        ev.charge();
        pv.refuel();
    }
}
