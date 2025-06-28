package BuildInFunction;

import java.time.ZoneId;
import java.time.ZonedDateTime;

    public class TimeZoneDemo {
        public static void main(String[] args) {

            // Current time in GMT (Greenwich Mean Time)
            ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

            // Current time in IST (Indian Standard Time)
            ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

            // Current time in PST (Pacific Standard Time)
            ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

            // Printing times
            System.out.println("GMT Time: " + gmtTime);
            System.out.println("IST Time: " + istTime);
            System.out.println("PST Time: " + pstTime);
        }
    }

