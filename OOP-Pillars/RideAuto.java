public class RideAuto extends RideVehicle implements GPS {
    private String location;

    public RideAuto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 1.1; // 10% extra for auto
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
