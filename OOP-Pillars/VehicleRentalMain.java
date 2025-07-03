import java.util.ArrayList;
import java.util.List;

public class VehicleRentalMain {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "CARPOL123"));
        vehicles.add(new Bike("BIKE456", 500, "BIKEPOL456"));
        vehicles.add(new Truck("TRUCK789", 2000, "TRUCKPOL789"));

        int days = 5;
        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(days);
            double insurance = 0;
            if (v instanceof Insurable) {
                insurance = ((Insurable)v).calculateInsurance();
                System.out.println(((Insurable)v).getInsuranceDetails());
            }
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insurance);
            System.out.println("Total: " + (rentalCost + insurance));
            System.out.println("---");
        }
    }
}
