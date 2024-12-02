package Modular1;

import java.util.Scanner;

import static Modular1.Libreria.esPrimo;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        boolean esPrimo = false;


        do {
            System.out.println("Introduce numeros enteros, para acabar introduce 0");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("El numero no es valido");
            } else {
                esPrimo = esPrimo(num);

                if (esPrimo == true) {
                    System.out.println("El numero es primo");
                } else System.out.println("El numero no es primo");
            }


        } while (num != 0);
    }
}
