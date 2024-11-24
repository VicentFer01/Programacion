package Tema3;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia, mes, anyo;

        do {
            System.out.println("Introduce un dia (1-31)");
             dia = scan.nextInt();
            System.out.println("Introduce un mes (1-12)");
             mes = scan.nextInt();
            System.out.println("Introduce un año");
             anyo = scan.nextInt();
        } while (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anyo < 1);
    }
}

