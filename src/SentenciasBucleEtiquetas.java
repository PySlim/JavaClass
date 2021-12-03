public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {


        buble1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue buble1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }

        }

        System.out.println("*************************");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.println("i = " + i + ", j = " + j);
            }

        }
    }
}
