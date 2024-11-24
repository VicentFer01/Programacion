package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter, counter2;

        System.out.println("Introduce el caracter");
        char caracter  = scan.next().charAt(0);

        System.out.println("Introduce la longitud");
        int leng = scan.nextInt();

        triangle(caracter, leng);
    }
    


    public static void triangle(char caracter, int leng) {
        for ( int counter = 1; counter <= leng; counter++  ) {
            System.out.println(caracter);

        }

        for ( int counter2 = 1;)
    }
}
