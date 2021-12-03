public class SwichCase {
    public static void main(String[] args) {
        int num = 0;
        // long num = 3;
        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                System.out.println("Es otra linea");
                System.out.println("se ejecutara");
                break;
        }

        String cadena = "hola";
        // long num = 3;
        switch (cadena) {
            case "hi":
                System.out.println("El numero es cero");
                break;
            case "hola":
                System.out.println("El numero es uno");
                break;
            case "olá":
                System.out.println("El numero es dos");
                System.out.println("Es otra linea");
                System.out.println("se ejecutara");
                break;
            default:
                System.out.println("No se encontró");
            }
        }
}
