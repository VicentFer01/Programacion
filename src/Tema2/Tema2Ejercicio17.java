package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int input;
            double lado, altura, ancho, base;
            double area, perimetro;
        System.out.println("Introduce un caracter (0-2)");
        input =  scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Introduce el valor del lado del cuadrado");
                lado =  scan.nextDouble();
                area = lado * lado;
                perimetro = lado * 4;
                System.out.println("El area del cuadrado es " + area + "y el perimetro es " + perimetro);
                break;
            case 1:
                System.out.println("Introduce el valor del lado");
                lado = scan.nextDouble();
                System.out.println("Introduce el valor del ancho");
                ancho = scan.nextDouble();
                area =  lado * ancho;
                perimetro = 2 * (lado * ancho);
                System.out.println("El area del rectangulo es " + area + "  y el perimetro " + perimetro);
                break;
            case 2:
                System.out.println("Introduce la base del triangulo");
                base = scan.nextDouble();
                System.out.println("Introduce la altura del triangulo");
                altura = scan.nextDouble();
                area = (base * altura) / 2;
                System.out.println("La area del triangulo es " + area);
                break;
            default:
                System.out.println("No has introducido un caracter valido");



        }
    }
}
