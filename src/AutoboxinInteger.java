public class AutoboxinInteger {
    public static void main(String[] args) {

        // seria la forma explicita o automática
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        // no necesita de una forma no automática
        Integer[] enteros2 = {Integer.valueOf(1),Integer.valueOf(2),3,4,5,6,7,8,9,10,11,12,13};


        //Sumando los valores pares del array anterior
        int suma = 0;
        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i.intValue();
            }
        }

        System.out.println("suma = " + suma);






    }
}
