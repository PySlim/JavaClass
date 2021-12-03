public class OperadorInstanceOf {
    public static void main(String[] args) {
        // String texto = new String("Creando un objeto de la clase String...que tal.");
        String texto = "Creando un objeto de la clase String...que tal";
        Integer nun = 7;
        
        boolean b1 = texto instanceof String;
        System.out.println("b1 = " + b1);

        if(texto instanceof String && nun instanceof  Integer){
            System.out.println("Si son de su clase.");
        }

        boolean b2 = texto instanceof Object;
        System.out.println("b2 = " + b2);

        boolean b3 = nun instanceof Object;
        System.out.println("b3 = " + b3);

        boolean b4 = nun instanceof Number;
        System.out.println("b4 = " + b4);

        boolean b5 = nun instanceof  Integer;
        System.out.println("b5 = " + b5);


    }
}
