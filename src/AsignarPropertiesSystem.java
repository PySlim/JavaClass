import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropertiesSystem {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties();
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor en el objeto propiedades");
            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);


        } catch (Exception e){
            System.out.println("e = " + e);
        }






    }
}
