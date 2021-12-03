import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "slim";
        String password = "12345";

        String username2 = "admin";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del usuario");
        String u = scanner.next();
        System.out.println("Ingrese el password");
        String p = scanner.next();
        boolean esAutenticado = false;

        if(username.equals(u) && password.equals(p) || (username2.equals(u) && password2.equals(p))){
            esAutenticado = true;
        }

        if (esAutenticado){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Contraseña invalida.");
        }



    }
}
