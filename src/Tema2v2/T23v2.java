package Tema2v2;

import java.util.Scanner;

public class T23v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, suma = 0, contador = 0;
        double media;

        do {
            System.out.println("Introduce un número positivo (o un negativo para terminar):");
            num = scan.nextInt();

            if (num >= 0) {
                suma += num;
                contador++;
            }
        } while (num >= 0);

        if (contador > 0) {
            media =  (double) suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
}
