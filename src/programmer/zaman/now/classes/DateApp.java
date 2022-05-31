package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        // example 1
        // without milisecond
        Date date  = new Date();
        System.out.println(date);

        // example 2
        // with parameter milisecond
        Date date2 = new Date(1654108615000L);
        System.out.println(date2);


        // example 3
        // with calender to set but for this the setting is default so the date will be show date today
        Calendar calender = Calendar.getInstance();

        // make represent
        Date date3 = calender.getTime();
        System.out.println(date3);


        // example4
        Calendar calender1 = Calendar.getInstance();
        calender.set(Calendar.MONTH, Calendar.MAY);
        calender.set(Calendar.YEAR, 2022);
        calender.set(Calendar.DATE, 20);

        Date date4 = calender.getTime();
        System.out.println(date4);
    }
}
