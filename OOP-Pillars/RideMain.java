public class RideMain {
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new RideCar("CAR001", "Alice", 15, "Sector 1"),
            new RideBike("BIKE002", "Bob", 10, "Sector 2"),
            new RideAuto("AUTO003", "Charlie", 12, "Sector 3")
        };
        double distance = 10; // km
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println("Fare for " + distance + " km: " + fare);
            System.out.println("---");
        }
    }
}
