package Tema3.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Wifi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hab;
        do {
            System.out.print("Introduce el numero de la habitación (1-20): ");
            hab = scan.nextInt();
        } while (hab < 1 || hab > 20);

        System.out.print("Introduce la potencia de señal (1-6): ");
        int senyal = scan.nextInt();

        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            int distancia = Math.abs(hab - 1 - i);
            if (distancia < senyal) {
                array[i] = senyal - distancia;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
