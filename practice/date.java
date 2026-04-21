//Count Valid Registrations
//This program counts the number of valid student registrations within a specified workshop period, including the start and end dates. The dates are given in "dd-mm-yyyy" format.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date {

    public static int countValidRegistrations(int n, String[] registrations, String start, String end) {
        // Define the format of the dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Parse start and end dates into LocalDate
        LocalDate startDate = LocalDate.parse(start, formatter);
        LocalDate endDate = LocalDate.parse(end, formatter);

        int count = 0;

        // Check each registration date
        for (String reg : registrations) {
            LocalDate regDate = LocalDate.parse(reg, formatter);

            // condition: startDate <= regDate <= endDate
            if ((regDate.isEqual(startDate) || regDate.isAfter(startDate)) &&
                (regDate.isEqual(endDate)   || regDate.isBefore(endDate))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        String[] registrations = {
            "01-01-2023", "10-01-2023", "05-02-2023",
            "25-12-2022", "03-01-2023", "01-03-2023"
        };
        String start = "01-01-2023";
        String end   = "31-01-2023";

        System.out.println("Valid registrations: " + countValidRegistrations(n, registrations, start, end));
    }
}
