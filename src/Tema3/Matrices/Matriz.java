package Tema3.Matrices;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max =  maxMatriz(matriz);
        System.out.println("Max" + max);

        int min = minMatriz(matriz);
        System.out.println("Min" + min);

        System.out.println("Introduce un num");
        int num = scan.nextInt();

        boolean exite = existeNum(matriz, num);
        if (exite) { System.out.println("Existe"); } else System.out.println("No existe");


    }

    public static int maxMatriz(int[][] matriz) {
            int maximo = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] > maximo) {
                        maximo = matriz[i][j];
                    }
                }
            }

            return maximo;
        }


    public static int minMatriz(int[][] matriz) {
        int min = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }

        return min;
    }

    public static boolean existeNum(int[][] matriz, int num) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean seRepite(int[][] matriz, int num) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }










}
