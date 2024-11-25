package Tema2v2;

import java.util.Scanner;

public class T25v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        double numraiz;
        boolean esprimo = false;
        System.out.println("Introduce el numero");
        num = scan.nextInt();

        if (num <= 1) System.out.println("No es primo");
        else if (num == 2 || num == 3) System.out.println(esprimo = true);
        numraiz = Math.sqrt(num);
        for (int i = 3; i < numraiz; i += 2) {
            if (num % i == 0) {
                esprimo = false;
                break;
            }
            if (esprimo) System.out.println("Es primo");
            else System.out.println("no es primo");


        }
    }
}
