public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1415e3;
        boolean m = false;

        boolean b1 = i==j && k>l;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);
        
        boolean b3 = i == j && k>l || m == false;
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k>l || m == false);
        System.out.println("b4 = " + b4);

        boolean b5 = (true||true) && false;

        boolean b6 = true || false && false || false;

        boolean b7 = false || true && true;
        System.out.println("b7 = " + b7);
    }
}