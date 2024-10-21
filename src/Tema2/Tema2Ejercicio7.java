package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = scan.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = scan.nextInt();

        if (num1 > num2) {
            result = (num1 - num2);
        }
        else {
            result  = (num2 - num1);
        }
        System.out.println("El resultado es " + result);
    }

    }
