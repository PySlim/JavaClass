import java.util.Locale;

public class EjemploStringValidate {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        String nuevo = "no vacío";
        if (esNulo){
            curso = "";
        }
        if(curso.length() > 0){
            System.out.println(nuevo.toUpperCase());
        }

        String nuevoDato = null;

        boolean valida = nuevoDato==null;

        if(valida){
            nuevoDato = "";
        }

        if (nuevoDato.isEmpty()){
            System.out.println("no esta vacío");
        }

        String ultimo = null;

        ultimo = " ";
        boolean verifica = ultimo.isBlank();

        if (verifica){
            System.out.println("paso");
        }
        // ************************************* Métodos String ****************

        String miNombre = "slim josh zegarra soto";

        System.out.println("Cantidad de caracteres: "+ miNombre.length());
        System.out.println("En mayúscula: " + miNombre.toUpperCase());
        System.out.println("En  minúscula: "+ miNombre.toLowerCase());
        System.out.println("Slim Josh Zegarra Soto es igual a utilizando equals = " + miNombre.equals("Slim Josh Zegarra Soto"));
        System.out.println("Slim Josh Zegarra Soto es igual a utilizando ignoreCase = " + miNombre.equalsIgnoreCase("Slim Josh Zegarra Soto"));
        System.out.println("Utilizando compareTo: " + miNombre.compareTo("Slim Josh Zegarra Soto"));
        System.out.println("Utilizando coompareTo: " + miNombre.compareTo("slim josh zegarra soto"));
        // Obteniendo un caracter:

        System.out.println("Obteniendo el primer caracter: "+ miNombre.charAt(0));

        //Substring

        System.out.println("Un fragmento: " + miNombre.substring(5,9).toUpperCase());

        String trabalenguas  = "trabalenguas";

        System.out.println("Remplazando :" + trabalenguas.replace("a","*"));

        // Buscando un caracter:

        System.out.println("Buscando primera a: " + trabalenguas.indexOf("a"));
        System.out.println("Buscando ultima a: " + trabalenguas.lastIndexOf("a") );
        System.out.println("Buscando algo que no esta: " + trabalenguas.indexOf("z"));

        // Si esta contenido:

        System.out.println("Se encuentra dentro de una cadena de string: " + trabalenguas.contains("slim"));
        // Empieza o termina

        System.out.println("empieza con tr: " + trabalenguas.startsWith("tr"));

        // Eliminando espacios en blanco

        System.out.println("    mucho espacios en blanco. ".trim());

        System.out.println("  Pedro Perico Leon  ".trim());

        // Aplicando lo aprendido:

        String archivo = "loquesea.jpg";

        System.out.println("La extension es: " + archivo.substring(archivo.lastIndexOf(".")+1));

        // Conversion de String a array

        String cadenaString = "Esta es una cadena de string";

        System.out.println("Convirtiendod a array : " +  cadenaString.toCharArray());

        char[] arreglo = cadenaString.toCharArray();

        System.out.println(arreglo[0]);

        for (int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]);
        }

        // Utilizando el split como un patron de separación en el array

        String dividiendo = "Estaxesxunaxcadenaxnuevaxdexstring";
        System.out.println();
        String[] arreglo2 = dividiendo.split("x");

        System.out.println(arreglo2);

        for(int i=0; i<arreglo2.length;i++){
            System.out.println(arreglo2[i]);
        }



    }
}
