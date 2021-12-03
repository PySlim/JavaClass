public class WrapperInteger {
    public static void main(String[] args) {
        // Forma explícita boxing; toma un valor primitivo y lo convierte en objeto
        Integer intObjeto = Integer.valueOf(32768);
        // Forma implícita; forma automática
        Integer intObject = 332768;


        int primitivo = 32768;

        Integer intObject2 = primitivo;

        // Convirtiendo el objeto a un primitivo

        int num = intObject2;
        int num2 = intObject2.intValue();
        // Partiendo desde un string
        
        String valorTvlcd = "6700";
        Integer valor = Integer.valueOf(valorTvlcd);

        System.out.println("valor = " + valor);

        // Perdida de información cuando el valor es mayor al soportado por el short
        Short shortObject = 32767;
        
        Short shortObject2 = intObject2.shortValue();
        System.out.println("shortObject2 = " + shortObject2);

        // Si convertimos hacia una clase mayor no se produce perdida de información

        Long longObjecto = intObject2.longValue();
        System.out.println("longObjecto = " + longObjecto);




    }
}
