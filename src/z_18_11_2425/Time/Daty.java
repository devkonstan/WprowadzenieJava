package z_18_11_2425.Time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Daty {
    public static void main(String[] args) {

        //wyswietlic aktualna date
        Date date = new Date();
        System.out.println(date.toString());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(LocalDate.now());

        //data zdefiniowana przez uzytkownika
        GregorianCalendar gregCal = new GregorianCalendar();
        gregCal.set(1992, Calendar.MARCH, 19);
        System.out.println(gregCal.getTime());

        NullPointerException np = new NullPointerException();
        np.printStackTrace();

    }
}