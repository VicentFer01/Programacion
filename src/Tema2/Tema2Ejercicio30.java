package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        double num1, num2, result = 0;
        char op;
        String seguir = "";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Introduce el primer numero");
            num1 = scan.nextDouble();

            System.out.println("Introduce el segundo numero");
            num2 = scan.nextDouble();

            System.out.println("Introduce la operacion (+, -, *, /):");
            op = scan.next().charAt(0);

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
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
            }

            System.out.println("El resultado es " + result);

            System.out.println("¿Quieres hacer otra operación? (pon si):");
            seguir = scan.next();

        } while (seguir.equals("si"));

        System.out.println("Programa terminado.");
        scan.close();
    }
}





