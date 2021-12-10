import java.util.Properties;

public class SistemProperties {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String version = System.getProperty("java.version");
        System.out.println("workSpace = " + version);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "Una linea nueva de codigo");

        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 = " + lineSeparator2+"mismas propiedades");

        //Listar todas las propiedades

        Properties p = System.getProperties();
        p.list(System.out);

    }
}
