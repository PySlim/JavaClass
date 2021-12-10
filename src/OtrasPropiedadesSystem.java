import java.io.FileInputStream;

public class OtrasPropiedadesSystem {
    public static void main(String[] args) {
        try{
            FileInputStream archive = new FileInputStream("src/config2.properties");
        } catch (Exception e){
            System.err.println("e = " + e.getMessage());
            System.exit(1);
        }
        //limpia espacio de memoria.
        System.gc();

    }
}
