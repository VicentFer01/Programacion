package Tema2;
/* Realiza un programa que calcule el precio de la estancia en un camping.
Leerá por consola el número de personas y días. La tarifa estándar es
de 15 €/noche, pero si son más de 5 personas y se quedan al menos una
semana el precio se reduce un 25% */


import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        int personas, noches;
        double pEstandar;
        final double Pnoche = 15;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la cantidad de personas");
        personas = scan.nextInt();
        System.out.println("Introdce la cantidad de noches");
        noches = scan.nextInt();
        System.out.println("Serán " + personas + " personas y " + noches + " noches");

        if (personas < 5 && personas > 1) {
            pEstandar = personas * Pnoche;
        } else

    }
}
