package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        double num1, num2, num3;
        int mediasin;
        double mediacon;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = scan.nextDouble();
        System.out.println("Introduce el segundo numero");
        num2 = scan.nextDouble();
        System.out.println("Introduce el tercer numero");
        num3 = scan.nextDouble();
        mediasin = (int) ((num3 + num2 + num1) / 3);
        mediacon = (num3 + num2 + num1) / 3;
        System.out.println("La media es " + mediasin);
        System.out.println("La media con decimal es " + mediacon);

    }
}
