// Smart Home Devices: Single Inheritance
class Device {
    protected String deviceId;
    protected String status;
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}
class Thermostat extends Device {
    private double temperatureSetting;
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Thermostat Setting: " + temperatureSetting + "°C");
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH123", "ON", 22.5);
        t.displayStatus();
    }
}
