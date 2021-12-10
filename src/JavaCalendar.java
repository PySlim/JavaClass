import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class JavaCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        calendario.set(2021,Calendar.AUGUST,25,24,10);
        Date fecha  = calendario.getTime();
        System.out.println("fecha = " + fecha);

        calendario.set(Calendar.YEAR,2021);
        calendario.set(Calendar.MONTH,8);
        calendario.set(Calendar.DAY_OF_MONTH,25);

        Date fecha2 = calendario.getTime();
        System.out.println("fecha2 = " + fecha2);

    }
}
