package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Escribe un numero");
        num = scan.nextInt();
        if (num > 1) {
            System.out.println("El numero es positivo"); }
        else if (num < 0) {
            System.out.println("El numero es negativo"); }

        else System.out.println("El numero es 0");
            
        }

    }


