package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        double num, numfinal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero y se calculará su raíz cuadrada");
        num = scan.nextDouble();
        numfinal = Math.sqrt(num);

        if (numfinal > 0) {
            System.out.println("La raiz quadrada es " + numfinal);
        } else {
            System.out.println("El numero no puede ser negativo");
        }
    }
}
