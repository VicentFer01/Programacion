package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número 1 es el mayor.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número 2 es el mayor.");
        } else {
            System.out.println("El número 3 es el mayor.");
        }

        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            System.out.println("El número 1 es el del medio.");
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            System.out.println("El número 2 es el del medio.");
        } else {
            System.out.println("El número 3 es el del medio.");
        }

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("El número 1 es el menor.");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("El número 2 es el menor.");
        } else {
            System.out.println("El número 3 es el menor.");
        }
        scanner.close();

    }
}
