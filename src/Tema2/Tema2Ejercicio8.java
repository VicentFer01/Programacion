package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        double numEuros, total;
        final double dolar = 1.09;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euos");
        numEuros = scan.nextDouble();
        total = numEuros * dolar;
        System.out.println("El total en dolares es " + total);


    }
}
