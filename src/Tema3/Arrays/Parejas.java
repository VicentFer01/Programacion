package Tema3.Arrays;

import java.util.Scanner;

public class Parejas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] animales = {"León", "Mandril", "Suricata", "Facóquero", "Elefante", "Jirafa",
                "Cebra", "Tigre", "Rino", "Hiena"};

        String[] array = new String[20];

        for (int i = 0; i < 10; i++) {
            array[i * 2] = animales[i];
            array[i * 2 + 1] = animales[i];
        }

        barajarArray(array);

        boolean[] visible = new boolean[20];
        for (int i = 0; i < visible.length; i++) {
            visible[i] = false;
        }

        int parejasEncontradas = 0;

        while (parejasEncontradas < 10) {
            mostrarTablero(array, visible);

            System.out.println("Selecciona la primera posición (0-19): ");
            int pos1 = scan.nextInt();

            System.out.println("Selecciona la segunda posición (0-19): ");
            int pos2 = scan.nextInt();

            if (pos1 == pos2) {
                System.out.println("Las posiciones no pueden ser iguales, intenta de nuevo.");
                continue;
            }

            if (array[pos1].equals(array[pos2])) {
                visible[pos1] = true;
                visible[pos2] = true;
                parejasEncontradas++;
                System.out.println("¡Pareja encontrada!");
            } else {
                System.out.println("No coinciden, intenta de nuevo.");
            }
        }

        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
    }

    private static void barajarArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            // Intercambiar elementos
            String temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    private static void mostrarTablero(String[] array, boolean[] visible) {
        for (int i = 0; i < 20; i++) {
            if (visible[i]) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print("X ");
            }
        }
        System.out.println();
    }
}
