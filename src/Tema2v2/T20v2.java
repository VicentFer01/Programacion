package Tema2v2;

import java.util.Scanner;

public class T20v2 {
    public static void main(String[] args) {
        int A, B;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el valor de A");
        A = scan.nextInt();
        System.out.println("Introduce el valor de B");
        B = scan.nextInt();

        if (B > A) {
            A = counter;
            while (counter < B) {
                counter++;
                if ( counter % 2 != 0) {
                    System.out.println(counter);
                }
            }
        }

    }
}
