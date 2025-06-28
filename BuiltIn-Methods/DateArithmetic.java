package BuildInFunction;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {

        // Input date (you can also take from Scanner if needed)
        LocalDate inputDate = LocalDate.of(2022, 6, 20);

        // Adding 7 days, 1 month, and 2 years
        LocalDate addedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting 3 weeks from the result
        LocalDate finalDate = addedDate.minusWeeks(3);

        // Displaying results
        System.out.println("Original Date: " + inputDate);
        System.out.println("Date after adding 7 days, 1 month, 2 years: " + addedDate);
        System.out.println("Final Date after subtracting 3 weeks: " + finalDate);
    }
}
