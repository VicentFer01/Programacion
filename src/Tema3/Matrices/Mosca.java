package Tema3.Matrices;

import java.util.Scanner;
import java.util.Random;

public class Mosca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int moscaX = random.nextInt(5)  ;
        int moscaY = random.nextInt(5)  ;

        boolean atrapada = false;


        while (atrapada == false) {
            System.out.print("Ingresa una fila (1-4): ");
            int jugadorX = scanner.nextInt();
            System.out.println("Inresa una columna (1-4):");
            int jugadorY = scanner.nextInt();

            if (jugadorX < 1 || jugadorX > 4 || jugadorY < 1 || jugadorY > 4) {
                System.out.println("Posición inválida. Inténtalo de nuevo.");
            }

            if (jugadorX == moscaX && jugadorY == moscaY) {
                atrapada = true;
                System.out.println("Has atrapado a la mosca.");
            } else if (esAdyacente(jugadorX, jugadorY, moscaX, moscaY)) {
                System.out.println("La mosca se ha movido a otra posición.");
                moscaX = random.nextInt(5) ;
                moscaY = random.nextInt(5) ;
            } else {
                System.out.println("No hay rastro de la mosca. Sigue intentando.");
            }
        }

    }

    private static boolean esAdyacente(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1);
    }
}
