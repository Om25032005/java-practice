import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        // 1. Current Date and Time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);  // Example: 2025-09-17
        System.out.println("Current Time: " + currentTime);  // Example: 10:15:30.123
        System.out.println("Current DateTime: " + currentDateTime); // 2025-09-17T10:15:30.123

        // 2. Formatting and Parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDate); // Example: 17-09-2025 10:15

        LocalDate parsedDate = LocalDate.parse("01-01-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Parsed Date: " + parsedDate); // 2024-01-01

        // 3. Adding and Subtracting
        LocalDate plusDays = currentDate.plusDays(10);
        LocalDate minusMonths = currentDate.minusMonths(2);
        System.out.println("10 days later: " + plusDays);   // 2025-09-27
        System.out.println("2 months earlier: " + minusMonths); // 2025-07-17

        // 4. Comparing Dates
        LocalDate d1 = LocalDate.of(2025, 1, 1);
        LocalDate d2 = LocalDate.of(2025, 12, 31);
        System.out.println("Is d1 before d2? " + d1.isBefore(d2)); // true
        System.out.println("Is d1 after d2? " + d1.isAfter(d2));   // false
        System.out.println("Is d1 equal to 2025-01-01? " + d1.isEqual(LocalDate.of(2025, 1, 1))); // true

        // 5. Period (Difference in Years, Months, Days)
        LocalDate birthday = LocalDate.of(2000, 5, 15);
        Period age = Period.between(birthday, currentDate);
        System.out.println("Age: " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");
        // Example: Age: 25 years 4 months 2 days

        // 6. Duration (Difference in Hours, Minutes, Seconds)
        LocalTime t1 = LocalTime.of(9, 0);
        LocalTime t2 = LocalTime.of(18, 30);
        Duration workHours = Duration.between(t1, t2);
        System.out.println("Work duration: " + workHours.toHours() + " hours " + workHours.toMinutesPart() + " minutes");
        // Example: Work duration: 9 hours 30 minutes

        // 7. ChronoUnit Example
        long daysBetween = ChronoUnit.DAYS.between(d1, d2);
        System.out.println("Days between 2025-01-01 and 2025-12-31: " + daysBetween); // 364

        // 8. Time Zones
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("India Time: " + indiaTime);   // 2025-09-17T10:15+05:30[Asia/Kolkata]
        System.out.println("New York Time: " + newYorkTime); // 2025-09-16T23:45-04:00[America/New_York]

        // 9. Instant (Machine timestamp, UTC)
        Instant instantNow = Instant.now();
        System.out.println("Current Instant (UTC): " + instantNow); // 2025-09-17T04:45:30.456Z
    }
}
