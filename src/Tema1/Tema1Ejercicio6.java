package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Cual es el valor del radio? (en cm)");
        Scanner in = new Scanner(System.in);
        double radio = Double.parseDouble(in.nextLine());
        double area = 3.14 * radio * radio;
        System.out.println("El area es " + area + "cm²");
    }
}
