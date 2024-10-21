package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio12 {
    public static void main(String[] args) {
        int anyo;
        System.out.println("Introduce el año que quieras:");
        Scanner in = new Scanner(System.in);
        anyo = in.nextInt();

        if (anyo % 4 == 0) {
            if (anyo % 100 != 0 || anyo % 400 == 0) {
                System.out.println("El año es bisiesto");
            } else {
                System.out.println("El año no es bisiesto");
            }
        } else {
            System.out.println("El año no es bisiesto");
        }


    }
}
