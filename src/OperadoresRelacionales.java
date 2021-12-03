public class OperadoresRelacionales {
    public static void main(String[] args) {

        // los primitivos siempre los podemos comparar con  == los objetos con equals
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        // relación de igualdad;
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);
        boolean b2 = i != k;
        System.out.println("b2 = " + b2);

        Boolean  r = b1 == b2;
        System.out.println("r = " + r);

        boolean mayor = j > 1;
        System.out.println("menor = " + mayor);

        // Siempre se evaluarán los operadores relacionales y luego los de asignación
        
    }
}
