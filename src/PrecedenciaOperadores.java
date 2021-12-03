public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = i + j + k / 3;
        System.out.println("promedio = " + promedio);
        
        double promedioReal = (i+j+k)/3;
        System.out.println("promedioReal = " + promedioReal);

        double result = (i+j+k)/3*10;
        System.out.println("result = " + result);

        double result2 = (i+j+k)/(3*10);
        System.out.println("result2 = " + result2);

        double NuevoPromedio = ++i + j-- + k / 3d * 10;
        System.out.println("NuevoPromedio = " + NuevoPromedio);

    }
}
