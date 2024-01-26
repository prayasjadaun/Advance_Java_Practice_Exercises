import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class advance_06_calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.isLeapYear(2020));
        for (int i = 0; i < 10; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
