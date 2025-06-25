// HotelBooking.java
// Class with guest, roomType, nights; default, parameterized, and copy constructors
public class HotelBooking {
    private String guest;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    public HotelBooking(String guest, String roomType, int nights) {
        this.guest = guest;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guest = other.guest;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest: " + guest + ", Room Type: " + roomType + ", Nights: " + nights);
    }
}
