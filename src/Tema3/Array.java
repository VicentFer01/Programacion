package Tema3;

import java.util.Arrays;
import java.util.Scanner;

import static Tema3.MyArray.*;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la array 1");
        int leng = scan.nextInt();

        int[] array1 = new int[leng];

        System.out.println("Introduce los valores de la array");
        for (int i = 0; i < leng; i++ ) {
             array1[i] = scan.nextInt();
        }

        System.out.println("Introduce los valores de la array 2");

        int[] array2 = new int[leng];
        for (int i = 0; i < leng; i++ ) {
            array2[i] = scan.nextInt();
        }


        System.out.println("a) Un procedimiento que imprima el array.");
        System.out.println("b) Una función que devuelva el máximo del array.");
        System.out.println("c) Una función que devuelva el mínimo del array");
        System.out.println("d) Una función que devuelva la media.");
        System.out.println("e) Una función que te diga si un elemento existe en el array o no.");
        System.out.println("f) Una función que haga la suma de dos vectores (arrays).");
        System.out.println("g) Una función que haga la resta de dos vectores (arrays).");
        System.out.println("h) Una función que haga el producto escalar de dos vectores\n" +
                "(arrays).");
        System.out.println("i) Haz una función que invierta el orden de un array. Por ejempl");
        System.out.println("j) Haz un procedimiento que invierta el orden de un array.");
        System.out.println("k) Haz una función que nos indique si un array es capicua o no. El\n" +
                "siguiente array por ejemplo es capicua.");
        System.out.println("l) Haz un programa con un menú que te permita introducir uno o\n" +
                "dos vectores y hacer todas las operaciones anteriore");


        System.out.println();
        System.out.println("Seleccione una opcion");
        char opcion = scan.next().charAt(0);



        switch (opcion) {
            case 'a':
                imprimirArray(array1);
                break;
            case 'b':
                int maxnum = maxArray(array1);
                System.out.println("El numero maximo es" + maxnum);
                break;
            case 'c':
                int minum = minArray(array1);
                System.out.println("El numero minimo es" + minum);
                break;
            case 'd':
                int media = medArray(array1);
                System.out.println("Esto es la media " + media);
                break;
            case 'e':
                System.out.println("Introduce un numero para comprobar si esta en la array");
                int num1 = scan.nextInt();

                boolean existe = existeNum(array1, num1);
                if (existe) {
                    System.out.println("Si existe en la array"); }
                else System.out.println("No existe en la array");
                break;
            case 'f':
                int[] suma = sumaArrays(array1, array2);
                System.out.println("Suma arrays" + Arrays.toString(suma));
                break;

            case 'g':
                int[] resta = restaArrays(array1, array2);
                System.out.println("Resta arrays" + Arrays.toString(resta));
                break;
            case 'h':
                int[] producto = productoArrays(array1, array2);
                System.out.println("Producto arrays" + Arrays.toString(producto));
                break;
            case 'i':
                int[] invertida = arrayInvertida(array1);
                System.out.println("Esta es la invertida" + Arrays.toString(invertida));
                break;
            case 'j':
                procInvertida(array1);
                break;
            case 'k':
                boolean esCapicua = arrayApicua(array1);
                if (esCapicua) {System.out.println("Es capicua"); }
                else  {System.out.println("No es capicua"); }
                break;
        }

         }

}
