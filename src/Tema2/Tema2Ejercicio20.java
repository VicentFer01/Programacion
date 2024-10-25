package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B;
        int counter;
        System.out.println("Introduce el valor de A");
        A = scan.nextInt();
        System.out.println("Introduce el valor de B");
        B = scan.nextInt();

        if (B > A) {
            counter = A;
            while (A < B) {
                counter = counter + 2;
                System.out.println(counter);
            }
        }

    }
}
