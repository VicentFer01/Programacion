package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = scan.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = scan.nextInt();
        System.out.println("Introduce el tercer numero");
        num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es " + num2);
        } else {
            System.out.println("El mayor es " + num3);
        }
        scan.close();




        }

    }
