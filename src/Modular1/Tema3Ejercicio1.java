package Modular1;

import java.util.Scanner;

import static Modular1.Libreria.Libreria1.isAdult;
import static Modular1.Libreria.Libreria1.numberSign;


public class Tema3Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        int signo = numberSign(numero);

        if (signo == 1) {
            System.out.println("El número es positivo.");
        } else if (signo == -1) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        int edad = 0;

        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();

        boolean adulto = isAdult(edad);

        if (adulto == true) System.out.println("Eres mayor de edad");
        else System.out.println("No eres mayor de edad");
    }

}
