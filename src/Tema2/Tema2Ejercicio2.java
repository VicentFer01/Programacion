package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {
        double base, altura, superficie, perimetro;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el valor de la base");
        base = scan.nextDouble();
        System.out.println("Introduce el valor de la altura");
        altura = scan.nextDouble();
        superficie = base * altura;
        perimetro =  (2 * base) + (2 * altura);
        System.out.println("La superficie es " + superficie);
        System.out.println(("El perimetro es " + perimetro));
        scan.close();


    }
}