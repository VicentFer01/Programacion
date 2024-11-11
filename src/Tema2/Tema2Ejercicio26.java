package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el numero entero");
        int num = scan.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else if (num == 2) {
            esPrimo = true;
        } else if (num % 2 == 0) {
            esPrimo = false;
        } else {
            int raiz = (int) Math.sqrt(num);  /*Desde el 3 hata la raiz del numero siempre hay un numero primo */
            for (int i = 3; i <= raiz; i += 2) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }


        scan.close();
    }
}
