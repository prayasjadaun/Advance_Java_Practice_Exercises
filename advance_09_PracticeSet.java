import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

public class advance_09_PracticeSet {
    public static void main(String[]args){
        ArrayList ar = new ArrayList<>();

        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);
        }

        //Question-2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //Question--3
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone());

        //Question--4
        LocalTime t = LocalTime.now();
        System.out.println(t);
    }
}
