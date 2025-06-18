// CalendarPrinter.java
// Program to print calendar for a given month and year
import java.util.Scanner;

public class CalendarPrinter {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    // Check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month-1];
    }
    // Zeller's Congruence to get the first day of the month
    public static int getFirstDay(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (1 + 13*(m+1)/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7; // 0 = Sunday
    }
    public static void printCalendar(int month, int year) {
        System.out.println("    " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(month, year);
        int numDays = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
        sc.close();
    }
}
