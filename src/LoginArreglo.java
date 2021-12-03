import java.util.Scanner;

public class LoginArreglo {
    public static void main(String[] args) {
        /*String[] usernames = new String[2];
        String[] password  = new String[2];
        usernames[0] = "slim";
        password[0] = "12345";

        usernames[1] = "admin";
        password[1] = "12345";*/

        String[] usernames = {"andres","admin","pepe"};
        String[] password = {"12345", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean isAutenticathed = false;

        for( int i = 0; i < usernames.length;i++){
            if(usernames[i].equals(u) && password[i].equals(p)){
                isAutenticathed = true;
                break;
            }
        }


        if(isAutenticathed){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("No ingresaste");
        }

    }
}
