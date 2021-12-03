public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f; // require la f porque por defecto seria double

        if(promedio>=6.5){
            System.out.println("Felicitaciones");
        } else {
            System.out.println("Esfuerzate");
        }

        // Es posible pero no recomendable

        if(promedio >= 6.5)
            System.out.println("chevere");
        else
            System.out.println("Que palta");

        // Evaluando otra condición

        if(promedio>=6.5){
            System.out.println("Felicitaciones");
        } else if(promedio == 6){
            System.out.println("Bien hecho");
        }else if (5 < promedio  && promedio < 6){
            System.out.println("A las justas");
        }else{
            System.out.println("Jalaste");
        }
    }
}
