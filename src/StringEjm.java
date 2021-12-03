import java.lang.String;

public class StringEjm {
    public static void main(String[] args) {
        String str1 = "Hola Slim";
        String str2 = new String("Hola Slim");
        System.out.println("Son los mismos objetos? "+(str1==str2));
        System.out.println("Tienen el mismo valor? "+str1.equals(str2));
        String mayusculaTxt = "HOLA DESDE JAVA";
        String minusculaTXT = "hola desde java";
        System.out.println("Comparando minuscula y mayuscula: "+(mayusculaTxt==minusculaTXT));
        System.out.println("Comparando utilizando equalsIgnoreCase: "+mayusculaTxt.equalsIgnoreCase(minusculaTXT));

        // *********************************Concatenación de String************************************************

        String curso = "Programación en java";
        String profesor = "Slim Zegarra";

        String detalle = curso+ " con el instructor "+profesor;
        System.out.println(detalle);

        String descripcion = "Resultado";

        int numeroA = 10;
        int numeroB = 20;

        System.out.println(descripcion+numeroA+numeroB);
        System.out.println(descripcion+(numeroA+numeroB));
        System.out.println(numeroA+numeroB+descripcion);

        //Concatenando utilizando método

        String flate = curso.concat(" con el instructor ").concat(profesor);
        System.out.println(flate);

        //Inmutabilidad String

        curso.concat(" coon el instructor ".concat(profesor));
        System.out.println(curso);

        String vaner = curso.concat(" coon el instructor ".concat(profesor));
        System.out.println(vaner);
        System.out.println("son iguales? "+(vaner == curso.concat(" coon el instructor ".concat(profesor))));
        System.out.println("Tienen valores iguales? " + vaner.equals(curso.concat(" coon el instructor ".concat(profesor))));
        
        String resultado2 = curso.transform(c->{
           return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = curso.transform(c->{
           return c + " con " + profesor; 
        });

        String modificado = resultado3.replace("a","A");
        System.out.println("modificado = " + modificado);

    }
}
