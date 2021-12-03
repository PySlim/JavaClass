public class TestRendimientoString {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb);

        long inicio = System.currentTimeMillis();
        for(int i = 0; i<500; i++){
            // c = c.concat(a).concat(b).concat("\n");
            // c = c + b + a + "\n";
            sb.append(a).append(b).append("\n");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: "+(fin-inicio));

    }
}
