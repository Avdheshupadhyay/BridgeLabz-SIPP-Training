// MovieTicketMain.java
// Test class for MovieTicket

public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.bookTicket("A10", 250.0);
        ticket.displayTicketDetails();
    }
}
