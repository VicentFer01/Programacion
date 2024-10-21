package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        double numDolar, total;
        final double euro = 0.92;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dolares");
        numDolar = scan.nextDouble();
        total = numDolar * euro;
        System.out.println("El total en dolares es " + total);

    }
}
