package Tema3;

public class MyArray {
    public static void imprimirArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }

    public static int maxArray(int[] Array) {
        int max = Array[0];

        //Suponemos que el primer numero es el mayor, el bucle recorre el array comparando si el numero (dependiendo de la iteacion) es mayor que el siguiente

        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        return max;
    }

    public static int minArray(int[] Array) {
        int min = Array[0];

        //Lo mismo pero al reves

        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        return min;

    }


    public static int medArray(int[] Array) {
        int counter = 0;
        for (int i = 0; i < Array.length; i++) {
            counter = counter + Array[i];
        }
        //Este no tiene mucho misterio
        return counter / Array.length;

    }

    public static boolean existeNum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

}
