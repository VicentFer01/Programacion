package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter, counter2;

        System.out.println("Introduce el caracter");
        char caracter = scan.next().charAt(0);

        System.out.println("Introduce la longitud");
        int leng = scan.nextInt();

        triangle(caracter, leng);
    }


    public static void triangle(char caracter, int numLineas) {
        int ancho = 1; // Inicializa el ancho con el primer valor impar (1)
        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println(); // Salto de línea después de cada fila
            ancho += 2; // Incrementar el ancho en 2 (siguiente número impar)
        }
    }
}
