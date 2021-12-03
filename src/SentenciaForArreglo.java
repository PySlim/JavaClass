import javax.swing.*;
import java.util.Locale;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        // String[] nombres = new String[6];
        // String[] nombres = {"Andres", "Pepe", "María", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        String nombres[]= {"Andres", "Pepe", "María", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        int count = nombres.length;

        for(int i=0;i<count;i++){
            System.out.println("Nombre: " + nombres[i]);
        }
        System.out.println("*********************************************");

        for(int i=0;i<count;i++){
            if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }


        System.out.println("**********************************************");
        //Uso de contains

        for(int i = 0; i<count; i++){
            if(nombres[i].contains("Andres") || nombres[i].contains("Pepa")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }
        System.out.println("**********************************************");
        //Optimizando la función anterior

        for(int i = 0; i<count; i++){
            if(nombres[i].toLowerCase().contains("andres") || nombres[i].toLowerCase().contains("pepa")){
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }

        System.out.println("**********************************************");

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"pepe\" o \"maría\"");
        System.out.println("buscando a " + buscar);

        boolean encontrado = false;

        for(int i=0; i<count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " Fue encontrado.");
        }else{
            JOptionPane.showMessageDialog(null,buscar + " No fue encontrado.");
        }
    }
}
