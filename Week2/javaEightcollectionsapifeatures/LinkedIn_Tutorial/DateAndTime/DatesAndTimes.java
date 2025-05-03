package DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatesAndTimes {
    public static void main(String[] args) {
        // Current date and time
        LocalDate currentDate = LocalDate.now();
        LocalDate currentdate2 = LocalDate.of(2025, 4, 3);
        
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Date "+currentdate2);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

        // Formatting dates and times
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // Parsing dates and times
        String dateStr = "2023-10-01";
        LocalDate parsedDate = LocalDate.parse(dateStr);
        System.out.println("Parsed Date: " + parsedDate);

        // Adding and subtracting time
        LocalDate nextWeek = currentDate.plus(1, ChronoUnit.WEEKS);
        LocalDate previousMonth = currentDate.minus(1, ChronoUnit.MONTHS);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Previous Month: " + previousMonth);

        // Working with time zones
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Zoned DateTime (New York): " + zonedDateTime);

        // Duration and Period
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 0);
        Duration workHours = Duration.between(startTime, endTime);
        System.out.println("Work Hours Duration: " + workHours.toHours() + " hours");

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}