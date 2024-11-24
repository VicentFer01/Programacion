package Tema3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        boolean validInput;
        double result;
        int seguir;


        do {


            do {
                validInput = true;
                System.out.println("Introduce el primer numero");

                if (scan.hasNextDouble()) {
                    num1 = scan.nextDouble();
                } else {
                    validInput = false;
                    System.out.println("Entrada no valida");
                    scan.next();
                    continue;
                }

                System.out.println("Introduce el segundo numero");

                if (scan.hasNextDouble()) {
                    num2 = scan.nextDouble();
                } else {
                    validInput = false;
                    System.out.println("Entrada no valida");
                    scan.next();
                    continue;
                }

            } while (!validInput);

            System.out.println("Elige el operadodr 1. Suma 2. Resta 3. Multiplicacion 4. Division");
            int operador = scan.nextInt();

            switch (operador) {
                case 1:
                    result = Sumar(num1, num2);
                    System.out.println(result);
                    break;
                case 2:
                    result = Restar(num1, num2);
                    System.out.println(result);
                    break;

                case 3:
                    result = Multiplicar(num1, num2);
                    System.out.println(result);
                    break;
                case 4:
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Error. Divison entre 0");
                    } else {
                        result = Division(num1, num2);
                        System.out.println(result);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }
            
            System.out.println("Introduce un 1 para seguir haciendo operaciones");

                seguir = scan.nextInt();
        } while (seguir == 1);
            
    }

    public static double Sumar(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double Restar(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double Multiplicar (double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double Division (double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
