public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;

        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post Incremento
        int x = 1;
        int y = x++;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // Pre decremento
        int w = 3;
        int r = --w;
        System.out.println("w = " + w);
        System.out.println("r = " + r);
        // Post decremento
        int e = 4;
        int u = e--;
        System.out.println("e = " + e);
        System.out.println("u = " + u);
    }
}
