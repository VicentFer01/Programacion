package Modular1;

import java.util.Scanner;

import static Modular1.Libreria.Libreria1.*;


public class Tema3Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radio = 0;
        boolean checker;

        do {
            System.out.println("Introduce el radio (>0):");
            radio = scan.nextDouble();

            checker = validRadius(radio);

        } while (checker == false);

        double perimetro = calculateCirclePerimeter(radio);
        System.out.println("El perimetro es " + perimetro);

        double area =  calculateCircleArea(radio);
        System.out.println("El area es " + area);


    }
}
