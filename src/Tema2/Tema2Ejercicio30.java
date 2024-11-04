package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        double num1, num2, result = 0;
        char op;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primero numero");
        num1 = scan.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = scan.nextDouble();

        System.out.println("Introduce la operacion (+, -, *, /):");
        op = scan.next().charAt(0); // Read operation as a character

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = (num1 - num2);
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Operacion no valida");
                return;
        }

        System.out.println("El resultado es " + result);
    }
}
