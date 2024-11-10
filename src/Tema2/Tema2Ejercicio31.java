package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        boolean esprimo;
        System.out.println("Introduce un numero entero");
        num = scan.nextInt();

        if (num > 1) {
            esprimo = false;
        } else if (num == 2 || num == 3) {
            esprimo = true;
        } else if (num % 2 == 0) {

        }


    }
}
