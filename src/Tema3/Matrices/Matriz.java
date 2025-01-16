package Tema3.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = {
                {1, 2, 3},
                {4, 3, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };


        imprimirMatriz(matriz);

        int[][] sumamatriz = sumaMatrices(matriz, matriz2);
        System.out.println(Arrays.deepToString(sumamatriz));

        int[][] restaMatriz = restaMatrices(matriz, matriz2);
        System.out.println(Arrays.deepToString(restaMatriz));


        int max = maxMatriz(matriz);
        System.out.println("Max" + max);

        int min = minMatriz(matriz);
        System.out.println("Min" + min);

        boolean unidad = matrizUnida(matriz);
        if (unidad) System.out.println("Es matriz unidad");
        else System.out.println("No es unidad");

        System.out.println("Introduce un num");
        int num = scan.nextInt();

        boolean exite = existeNum(matriz, num);
        if (exite) {
            System.out.println("Existe");
        } else System.out.println("No existe");

        int repiteCounter = repiteVeces(matriz, num);
        System.out.println("Se repite " + repiteCounter + " veces");




    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {  // filas
            for (int j = 0; j < matriz[i].length; j++) { // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

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

    public static int repiteVeces(int[][] matriz, int num) {
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[][] sumaMatrices(int[][] matriz, int[][] matriz2) {

        int[][] matrizSuma = null;

        if (matriz.length == matriz2.length) {
            matrizSuma = new int[matriz.length][matriz[0].length];

            for (int i = 0; i < matrizSuma.length; i++) {
                for (int j = 0; j < matrizSuma[i].length; j++) {
                    matrizSuma[i][j] = matriz[i][j] + matriz2[i][j];

                }
            }

        }

        return matrizSuma;
    }



    public static int[][] restaMatrices(int[][] matriz, int[][] matriz2) {

        int[][] matrizSuma = null;

        if (matriz.length == matriz2.length) {
            matrizSuma = new int[matriz.length][matriz[0].length];

            for (int i = 0; i < matrizSuma.length; i++) {
                for (int j = 0; j < matrizSuma[i].length; j++) {
                    matrizSuma[i][j] = matriz[i][j] - matriz2[i][j];
                }
                System.out.println();
            }

        }

        return matrizSuma;
    }

    public static boolean matrizUnida(int[][] matriz) {
        if (matriz.length == matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                int j;
                for (j = 0; j < matriz[i].length; j++) ;

                if (matriz[i][j] == 1) {
                    return true;
                } else return false;
            }

            } else System.out.println("No es una matriz unidad"); return false;
        }


    }

