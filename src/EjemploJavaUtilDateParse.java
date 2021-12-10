import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha1 = format.parse("25-12-2020");
            System.out.println("fecha1 = " + fecha1);
            System.out.println("format.format(fecha1) = " + format.format(fecha1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
