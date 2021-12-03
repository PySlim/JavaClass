public class InstanceOfTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Este es un string pero referido a su padre inmediato superior.";

        boolean b1 = texto instanceof String;
        System.out.println("b1 = " + b1);

        boolean b2 = texto instanceof  Integer;
        System.out.println("b2 = " + b2);
        
        Number num = 7;
        
        boolean b3 = num instanceof  Long;

        System.out.println("b3 = " + b3);


    }
}
