package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Introduce el primer número");
        Scanner in = new Scanner(System.in);
            num1 = in.nextInt();
        System.out.println("Introduce el segundo número");
            num2 = in.nextInt();

            if (num1 > num2) System.out.println("El número 1 es mayor que el número 2");
            else {
                System.out.println("El número 2 es mayor que el número 1");
            }

    }
}
