package Tema3;

import java.util.Arrays;
import java.util.Scanner;

import static Tema3.MyArray.*;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[]{1, 2, 3, 4, 5, 6};

        int[] numeros2 = new int[]{2, 4, 6, 8, 10, 12};

        int[] arraysuma = sumaArrays(numeros, numeros2);
        System.out.println(Arrays.toString(arraysuma));





        int maxnum = maxArray(numeros);
        System.out.println(maxnum);

        int minum = minArray(numeros);
        System.out.println(minum);

        int media = medArray(numeros);
        System.out.println("Esto es la media " + media);

        System.out.println("Introduce un numero");
        int num1 = scan.nextInt();

        boolean existe = existeNum(numeros, num1);
        if (existe) {
            System.out.println("Si existe en la array"); }
        else System.out.println("No existe en la array"); }

}
