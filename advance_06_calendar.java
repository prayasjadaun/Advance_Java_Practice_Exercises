import java.util.Calendar;
import java.util.TimeZone;

public class advance_06_calendar {
    public static void main(String[]args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
