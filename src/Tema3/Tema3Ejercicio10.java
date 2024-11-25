package Tema3;
import static Tema3.Libreria.Libreria1.*;
import static Tema3.Libreria.Libreria1.calculateCirclePerimeter;


import java.util.Scanner;

public class Tema3Ejercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char opcion;
        System.out.println("Introduce la opción");
        System.out.println("a) Muestra el signo de un número introducido por el usuario. \n b) Indica si el usuario es mayor de edad o no. \nc) Calcula el área y perímetro de un círculo. \nd) Conversor de euros a dólares y de dólares a euros. \n d) Mostrar tabla de multiplicar de un número. \nf) Mostrar tablas de multiplicar del 1 al 10. \n g) Comprobador de números primos. \n h) Comprobador de fechas. i) Dibujar triángulos.");
        opcion =  scan.next().charAt(0);

        switch (opcion) {
            case 'a':
                double numero = 0;
                int signo = numberSign(numero);
            case 'b':
                int edad = 0;
                boolean adulto = isAdult(edad);

            case 'c':
                double radio = 0;
                double perimetro = calculateCirclePerimeter(radio);

            case 'd':
                radio = 0;
                double area =  calculateCircleArea(radio);

            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':






        }
    }
}
