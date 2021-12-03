public class PrimitivosCharacter {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println(decimal == caracter);

        char símbolo = '@';
        System.out.println("símbolo = " + símbolo);

        var caracteres = '\u0041';
        System.out.println("caracteres = " + caracteres);

        System.out.println("char corresponde en bytes: "+ java.lang.Character.BYTES);
        System.out.println("character corresponde en bytes: "+ java.lang.Character.SIZE);
        System.out.println("character min value: " + java.lang.Character.MIN_VALUE);
        System.out.println("character max value: "+ java.lang.Character.MAX_VALUE);

        char espacio = ' ';
        char otroEspacio = '\u0020';
        System.out.println("Esta"+otroEspacio+"es" + otroEspacio + "otra forma.");
        char retroceso = '\b';
        System.out.println("Borra la c" + retroceso + retroceso);
        char tabulador = '\t';
        System.out.println("uno significa:" + tabulador +"1");
        char nuevaLinea = '\n';
        // usando directamente en la línea
        System.out.println("Asi se usa\u0020directamente e\b: \tlos caracteres especiales\nen las lineas de código.");

    }
}
