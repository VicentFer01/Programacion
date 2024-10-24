package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextInt();

        if (num3 == num2 +- 1 && num2 == num1 +- 1) {
            System.out.println("Los numeros son consecutivos");
        } else {
            System.out.println("Los numeros no son consecutivos");
        }


    }
}
