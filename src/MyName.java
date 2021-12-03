public class MyName {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());
        //Variables primitivas y Referencia
        int numero = 10;
        Integer numeroDos = 20;
        int numeroHard = 15;
        
        numeroDos.toString();
        System.out.println("numeroDos = " + numeroDos);

        boolean valor = true;

        if (valor){
            System.out.println("valor = " + valor);
            int numeroCambio = numero;
            numeroCambio = 4;
            System.out.println("numeroCambio = " + numeroCambio);
            System.out.println("numeroHard = "+numeroHard);
            numeroHard = 300;
            System.out.println("numeroHard = " + numeroHard);

            var dinamica = "15";
            System.out.println("dinámica es : "+ dinamica);

        }
        //Nombres de variables 
        int tres = 3;
        int _cuatro = 4;
        int Cinco = 5;
        System.out.println("Cinco = " + Cinco);
        int $seis = 6;


        // Inicialización de variables
        String nombrePersona;
        nombrePersona = "Slim";
        if (nombrePersona == "Slim"){
            nombrePersona = "Josh";
            System.out.println("nombrePersona = " + nombrePersona);
        }
        /*comentar más de una línea generalmente se usa
        esto.
         */
        // ctrl + /  ....... ctrl + mayus + /
       /* Integer numeroEntero = 123;
        Integer numeroEnteroDos = 2;
        Integer numeroEnteroTres = 3;*/

    }
}
