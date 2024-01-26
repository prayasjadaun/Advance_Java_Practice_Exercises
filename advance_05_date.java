import java.util.Date;

public class advance_05_date {
    public static void main(String[] args) {

        //Time
        System.out.println("1970 to till now in Seconds: " + System.currentTimeMillis() / 1000);
        System.out.println("1970 to till now in Minutess: " + System.currentTimeMillis() / 1000 / 3600);
        System.out.println("1970 to till now in Hours: " + System.currentTimeMillis() / 1000 / 3600 / 24);
        System.out.println("1970 to till now in Years: " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);

       // Date
        Date d = new Date();
        System.out.println(d);
    }
}
