import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("Fecha : " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for(int i = 0; i<100000000;i++){
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("El tiempo transcurrido en el for es : " + tiempoFinal);
    }
}
