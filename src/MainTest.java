import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testParseDate() {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.parseDate(dateString);
        OffsetDateTime expectedDate = OffsetDateTime.parse(dateString);

        assertEquals(expectedDate, dateTime);
    }

    @Test
    public void testFormatLocale() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedLocale = Main.formatLocale(dateTime);
        String expectedLocale = dateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        assertEquals(expectedLocale, formattedLocale);
    }

}