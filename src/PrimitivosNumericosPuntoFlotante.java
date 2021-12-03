public class PrimitivosNumericosPuntoFlotante {
    public static void main(String[] args) {

        System.out.println("Flotantes");
        float realFloat = 1;
        float realFloat2 = 2.0f;
        float realFloat3 = 2.12e3f;
        float realFloat4 = 2.5e-4f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("realFloat4 = " + realFloat4);

        System.out.println("float corresponde en byte a = "+Float.BYTES);
        System.out.println("float corresponde en bites a= "+Float.SIZE);
        System.out.println("maximo valor para float = "+Float.MAX_VALUE);
        System.out.println("mínimo valor para float = "+Float.MIN_VALUE);


        System.out.println("--------------------Flotante doble----------------");
        double realDouble = 3.121214455;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en bytes a: "+ Double.BYTES);
        System.out.println("Double corresponde en bites a: "+ Double.SIZE);
        System.out.println("maximo valor para double: "+ Double.MAX_VALUE);
        System.out.println("mínimo valor para double: "+ Double.MIN_VALUE);


        var varFlotante = 3.14d;
        System.out.println("varFlotante = " + varFlotante);



    }
}
