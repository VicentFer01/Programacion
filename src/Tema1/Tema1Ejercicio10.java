package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {
        float num1;
        float num2;
        double suma, resta, resto;
        float  div1;

        System.out.println("Introduce el numero 1");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        System.out.println("Introduce el numero 2");
        num2 = in.nextInt();

        suma = num1 + num2;
        System.out.println("La suma es " + suma);

        if (num1 > num2)
            resta = num1 - num2;
        else { resta = num2 - num1;}
        System.out.println("La resta es " + resta);

        if (num1 > num2) {
            div1 = num1 / num2;
            System.out.println("La división es " + div1);
        } else {
            div1 = num2 / num1;
            System.out.println("La division es " + div1);
        }

        if (num1 > num2) {
            resto = num1 % num2;
            System.out.print("El resto es " + resto);
        } else {
            resto = num2 % num1;
            System.out.print("El resto es " + resto);
        }
    }
}
