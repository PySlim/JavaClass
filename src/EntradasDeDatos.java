import javax.swing.*;

public class EntradasDeDatos {
    public static void main(String[] args) {

        int numeroDecimal= 1; // la asignación fuera del try
        String ingreso = JOptionPane.showInputDialog(null,"Ingrese un entero");
        try {
            numeroDecimal = Integer.parseInt(ingreso);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese un entero");
            main(args);
            System.exit(0); //Salida de la recursividad.
        }

        String mensaje = "El numero octal de "+numeroDecimal+ " es :0" + Integer.toOctalString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
