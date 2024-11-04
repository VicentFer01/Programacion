package Tema2;

import java.util.Scanner;

public class    Tema2Ejercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cont;
        cont = 0;
        System.out.println("Introduce un numero entero");
        num = scan.nextInt();

        while (num >= 1) {
            num = num / 10;
            cont++;
        }
        System.out.println("Hay " + cont);


    }

}
