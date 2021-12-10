import java.util.Random;

public class ClassRandon {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("random = " + random);
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[(int) random] = " + colores[(int) random]);

        Random random1 = new Random();
        long randomInt = random1.nextLong();
        System.out.println("randomInt = " + randomInt);
    }
}
