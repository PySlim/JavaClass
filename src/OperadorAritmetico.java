import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j=4;

        int suma = i +j;

        System.out.println("suma = " + suma);

        int x = 2, y=3, suma1 = x+y;

        System.out.println("suma1 = " + suma1);

        int resta =  y-x;
        System.out.println("resta = " + resta);

        int multiplicacion = x * y;

        float divicion = (float) y / (float)x;
        System.out.println("divicion = " + divicion);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        float numeroIngresado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un número:"));

        if(numeroIngresado % 2 == 0){
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado no es par");
        }
    }
}
