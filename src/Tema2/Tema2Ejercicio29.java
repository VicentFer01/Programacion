package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Introduce un numero");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while (guess != randomInt) {
            if (guess < randomInt) {
                System.out.println("El número es incorrecto pista: el número es mayor");
            } else {
                System.out.println("El número es incorrecto pista: el número es menor");
            }
            System.out.println("Introduce otro número");
            guess = scan.nextInt();
        }

        System.out.println("Has adivinado el numero");
        scan.close();
    }
}