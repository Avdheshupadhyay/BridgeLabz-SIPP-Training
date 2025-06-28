package BuildInFunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        // Get current date
        LocalDate today = LocalDate.now();

        // Format 1: dd/MM/yyyy (e.g. 20/06/2025)
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format 2: yyyy-MM-dd (e.g. 2025-06-20)
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Format 3: EEE, MMM dd, yyyy (e.g. Fri, Jun 20, 2025)
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Print formatted dates
        System.out.println("Format 1: " + today.format(format1));
        System.out.println("Format 2: " + today.format(format2));
        System.out.println("Format 3: " + today.format(format3));
    }
}
