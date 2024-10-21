package Tema1;

import java.util.Scanner;

public class
    Tema1Ejercicio9 {
    public static void main(String[] args) {
        int num1; /*Aunque los numeros que tengas que introducir son enteros a la hora de dividir los numeros si
        estan definidos como enteros el resultado tambien sera entero y no decimal */
        int num2;
        double suma, resta, resto;
        float  div1;

        System.out.println("Introduce el primer numero ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        System.out.println("Introduce el segundo numero ");
        num2 = in.nextInt();

        suma = num1 + num2;
        System.out.println("La suma es " + suma);

        if (num1 > num2) {
            resta = num1 - num2;
            System.out.println("La resta es " + resta);

            resto = num1 % num2;
            System.out.println("El resto es " + resto);

            div1 = num1 / num2;
            System.out.println("La division es " + div1);
        }
            else {
                resta = num2 - num1;
                System.out.println("La resta es " + resta);

                resto = num2 % num1;
                System.out.println("El resto es " + resto);

                div1 = num2 / num1;
                System.out.println("La division es " + div1);
        }

        }
        }

