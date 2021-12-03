import java.util.Scanner;

public class Pizarra {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("la variable iteradora es :" + i);
        }

        for(int i=0;i<10;i++)
            System.out.println("la variable iteradora es :" + i);


        System.out.println("***************************************");
        int j=0;
        for(;j<4;j++){
            System.out.println(j);
        }

        System.out.println("***************************************");

        int x = 0;
        for(;;){
            if(x > 5){
                break;
            }
            System.out.println("x = " + x);
            x++;
        }

        System.out.println("***************************************");

        for(int i =2;i<10; i +=2){
            System.out.println("i = " + i);
        }

    }
}
