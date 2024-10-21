package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado, superficie, perimetro;
        System.out.println("Introduce el valor del lado");
        lado = scan.nextDouble();
        superficie = lado * lado;
        perimetro = lado * 4;
        System.out.println("La superficie es " + superficie);
        System.out.println("El perimetro es " + perimetro);

        scan.close();

    }

}

