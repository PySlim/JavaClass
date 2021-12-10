import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv=System.getenv();

        System.out.println("varEnv = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        //Usando el mapa
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
    }
}
