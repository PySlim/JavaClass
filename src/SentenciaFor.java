public class SentenciaFor {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println("Genial " + i);
        }

        //posible no recomendable
        for (int i=0;i<=5;i++)
            System.out.println("hola");

        int j = 0;

        for(;j<3;j++){
            System.out.println("tres");
        }

        // Otra forma de usar el for

        int x = 0;
        for(;;){
            if(x >5){
                break;
            }
            System.out.println("x = " + x);
            x++;
        }

        int z=0;
        for(int i=2;i<12;i++){
            z = z + i;
        }
        System.out.println("z es igual a " + z);

        for(int i=0,a=10; i<j;i++,a--){
            System.out.println(i + " - " + a);
        }

        // Uso del continue

        for(int i = 0; i<=10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i impar es: " + i);
        }

        for(int i=0; i<10; i += 2){
            System.out.println("paso " + i);
        }

    }
}
