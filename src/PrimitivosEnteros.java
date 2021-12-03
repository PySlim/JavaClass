public class PrimitivosEnteros {
    public static void main(String[] args) {
        // enteros , flotantes, caracteres, boléanos

        // boolean
        boolean uno = false;
        boolean dos = true;
        
        //Char
        char a = 'a';
        char b = '1';
        char c = '\u0021';
        System.out.println("c = " + c);

        /*secuencias de escape  simbolo
                \b            Retroceso
                \n            Nueva línea
                \r            Retorno de carro
                \t            Tabulador
                \\            Diagonal invertida
                \"            comillas dobles*/
        // Números enteros primitivos
        //entre -128 a 127
        byte enteroByte = 127;

        //entre -32768 a 32767
        short enteroShort = 32767;

        //entre -2147483648 a 2147483647
        int enteroInt = 2147483647;

        //entre -92233722036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L;


        ///////////////////////////////////////
        byte numeroByte = 127;
        //byte numeroByte2 = 128;
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE );
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);
        short numeroShort = 30000;
        System.out.println("numeroShort = "+ numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE );
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);
        int  numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE );
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);
        long numeroLong  = 545645456456456456L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE );
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);
    }
}
