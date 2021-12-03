public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;

        // while

        while (i<5){
            System.out.println("i = " + i);
            i++;
        }

        boolean prueba = true;

        while (prueba){

            if(i==7){
                prueba = false;
            }
            System.out.println("prueba = " + prueba);
            i++;

        }

        // Do While

        boolean ejecuta = true;

        do {
            System.out.println("hola mundo");
            ejecuta = false;
        } while (ejecuta);



    }
}
