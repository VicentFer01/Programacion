package Tema3;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

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

    public static int[] sumaArrays(int[] array, int[] array2) {

        int[] arrayfinal = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayfinal[i] = array[i] + array2[i];
        }
        return arrayfinal;

    }

    public static int[] restaArrays(int[] array, int[] array2) {

        int[] arrayfinal = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayfinal[i] = array[i] - array2[i];
        }
        return arrayfinal;

    }

    public static int[] productoArrays(int[] array, int[] array2) {
        int[] arrayfinal = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayfinal[i] = array[i] * array2[i];
        }
        return arrayfinal;
    }

    public static int[] arrayInvertida(int[] array) {
        int[] arrayInvertida = new int[array.length];

        for (int i = 0; i < array.length; i++ ) {

            arrayInvertida[i] = array[array.length -1 -i];

        }
        return arrayInvertida;
    }
    public static void procInvertida(int[] array) {
        int[] arrayInvertida2 = new int[array.length];

        for (int i = 0; i < array.length; i++ ) {

            arrayInvertida2[i] = array[array.length -1 -i];

        }
        System.out.println(Arrays.toString(arrayInvertida2));

    }

   /* public static boolean arrayApicua(int[] array) {
        int counter = 0;
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length; i++, counter--) {
               if (array[i] == array[array.length + counter]) {
                   return true;
               } else return false;


            }
            return false;
        }
        return false;
    } */

    public static boolean arrayApicua(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }



}
