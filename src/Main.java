import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseDate(dateString);

        String dataString = formatLocale(dateTime);
        System.out.println(dataString);

    }

    static String formatLocale(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }

    static OffsetDateTime parseDate(String dateString) {
        return OffsetDateTime.parse(dateString);
    }
}