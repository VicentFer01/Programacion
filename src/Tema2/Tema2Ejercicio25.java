package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        double fact = 1;

        System.out.println("Introduce el número:");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("El factorial de " + num + " es: " + fact);
        scan.close();
    }
}

