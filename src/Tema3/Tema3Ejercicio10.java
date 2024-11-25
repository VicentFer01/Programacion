package Tema3;
import static Tema3.Libreria.*;
import static Tema3.Libreria.Libreria1.*;
import static Tema3.Libreria.Libreria1.calculateCirclePerimeter;


import java.util.Scanner;

public class Tema3Ejercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Introduce la opción");
            System.out.println("a) Muestra el signo de un número introducido por el usuario \n" +
                    "b) Indica si el usuario es mayor de edad o no \n" +
                    "c) Calcula el área y perímetro de un círculo \n" +
                    "d) Conversor de euros a dólares y de dólares a euros \n" +
                    "e) Mostrar tabla de multiplicar de un número \n" +
                    "f) Mostrar tablas de multiplicar del 1 al 10 \n" +
                    "g) Comprobador de números primos \n" +
                    "h) Comprobador de fechas \n" +
                    "i) Dibujar triangulos");

            opcion = scan.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("Introduce el numero");
                    double numero = 0;
                    numero = scan.nextInt();
                    int signo = numberSign(numero);
                    System.out.println(signo);
                case 'b':
                    int edad = 0;
                    System.out.println("Introduce tu edad");
                    edad = scan.nextInt();
                    boolean adulto = isAdult(edad);
                    System.out.println(edad);

                case 'c':
                    double radio = 0;
                    System.out.println("Introduce el radio");
                    radio = scan.nextInt();
                    double perimetro = calculateCirclePerimeter(radio);
                    System.out.println(perimetro);

                case 'd':
                    radio = 0;
                    System.out.println("Introduce el radio");
                    radio = scan.nextInt();
                    double area = calculateCircleArea(radio);
                    System.out.println(area);

                case 'e':
                    int tabla = 0;
                    System.out.println("Selecciona una tabla de multiplos 1-10");
                    tabla = scan.nextInt();
                    //int tabla = //
                case 'f':
                    tabla1();
                    tabla2();
                    tabla3();
                    tabla4();
                    tabla5();

                case 'g':
                    int num = 0;
                    boolean esPrimo;
                    System.out.println("Introduce el numero");
                    num = scan.nextInt();
                    esPrimo = esPrimo(num);
                    System.out.println(esPrimo);
                    if (esPrimo == true) System.out.println("Es primo");
                    else System.out.println("No es primo");

                case 'h':
                case 'i':
                default:
                    System.out.println("No has introducido una opcion valida");

            }
        } while (opcion != 'a' && opcion!= 'b' && opcion!= 'c' && opcion!= 'd' && opcion!= 'e' && opcion!= 'f' && opcion!= 'g' && opcion!= 'h' && opcion!= 'i' );
    }
}
