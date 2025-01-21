package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class buscaminas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 20;
        int numMinas = 6;

        int[] tablero = new int[size];
        for (int i = 0; i < size; i++) {
            tablero[i] = 0;
        }

        Random rand = new Random();
        int minasColocadas = 0;
        while (minasColocadas < numMinas) {
            int posicion = rand.nextInt(size);
            if (tablero[posicion] != -1) {
                tablero[posicion] = -1;
                minasColocadas++; //COlocar mina
            }
        }

        for (int i = 0; i < size; i++) {
            if (tablero[i] == -1); // Si es una mina no hacer nada

            int minasAdyacentes = 0;
            for (int j = i - 1; j <= i + 1; j++) {
                if (j >= 0 && j < size && tablero[j] == -1) {
                    minasAdyacentes++;
                }
            }

            tablero[i] = minasAdyacentes;
        }

        boolean[] descubiertas = new boolean[size];
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero(tablero, descubiertas);

            System.out.print("Selecciona una casilla (0-19): ");
            int seleccion = scan.nextInt();



            if (tablero[seleccion] == -1) {
                System.out.println("¡Boom! Has explotado una mina. Fin del juego.");
                juegoTerminado = true;
            } else {
                descubiertas[seleccion] = true;

                if (todasDescubiertas(tablero, descubiertas)) {
                    System.out.println("¡Felicidades! Has ganado.");
                    juegoTerminado = true;
                }
            }
        }

        
    }

    private static void mostrarTablero(int[] tablero, boolean[] descubiertas) {
        for (int i = 0; i < tablero.length; i++) {
            if (descubiertas[i]) {
                if (tablero[i] == -1) {
                    System.out.print("* "); // Mina
                } else {
                    System.out.print(tablero[i] + " "); // Pista
                }
            } else {
                System.out.print("X "); // Casilla oculta
            }
        }
        System.out.println();
    }

    private static boolean todasDescubiertas(int[] tablero, boolean[] descubiertas) {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] != -1 && !descubiertas[i]) {
                return false;
            }
        }
        return true;
    }
}
