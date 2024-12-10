package Modular1;

import java.util.Scanner;

import static Modular1.Libreria.*;

public class    Tema3Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero entre 1 y 10: ");
            numero = scanner.nextInt();

        } while (numero < 1 || numero > 10);

        mostrarTabla(numero);
    }


    public static void mostrarTabla(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
