import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            System.out.println("Error debe ingresar un numero Entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("El numero octogonal es: "+ Integer.toOctalString(numeroDecimal));

        int numeroDecimalDos = 0;
        try {
            numeroDecimalDos = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("ingrese un numero entero.");
            main(args);
            System.exit(0);
        }
    }
}
