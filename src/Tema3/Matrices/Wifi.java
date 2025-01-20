package Tema3.Matrices;

import java.util.Scanner;

public class Wifi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 12;
        int cols = 5;
        int[][] hotel = new int[rows][cols];

        System.out.println("Introduce la planta del router (1-12):");
        int routerX = scanner.nextInt();
        System.out.println("Introduce la habitación del router (1-5):");
        int routerY = scanner.nextInt();

        System.out.println("Introduce la potencia del router:");
        int power = scanner.nextInt();



        calculateCovertura(hotel, rows - routerX, routerY - 1, power);

        imprimirMatriz(hotel);

    }

    public static void calculateCovertura(int[][] matriz, int x, int y, int power) {
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                int distance = Math.abs(i - x) + Math.abs(j - y);

                if (distance <= power) {
                    matriz[i][j] = power - distance;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {  // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
