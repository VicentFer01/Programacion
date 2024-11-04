package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        double num1, num2, op, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primero numero");
        num1 = scan.nextDouble();
        System.out.println("Introduce el segundo numero");
        num2 = scan.nextDouble();
        System.out.println("Introduce la operacion");
        op = scan.nextInt();

        switch ((int) op) {
            case '+': result = num1 + num2;
            case '-': if (num1 > num2) {
                        result = num1 - num2; }
                        else { result = num2 - num1;}
            case '*': result = num1 * num2;
            }

        }

    }
}
