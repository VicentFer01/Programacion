package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args)  {
        int caraopuesta;
        System.out.println("Introduzca la cara de un lado");
        Scanner in = new Scanner(System.in);
        int cara = Integer.parseInt(in.nextLine());
        System.out.println("Has elegido el numero " + cara );

        if (cara < 1 || cara > 6)
            System.out.println("La cara no es valida");

        else {
            caraopuesta = 7 - cara;
            System.out.println("La cara opuesta es " + caraopuesta);
        }

    }
}
