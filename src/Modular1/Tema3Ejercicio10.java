package Modular1;
import static Modular1.Libreria.*;
import static Modular1.Libreria.Libreria1.*;
import static Modular1.Libreria.Libreria1.calculateCirclePerimeter;
import static Modular1.Tema3Ejercicio8.validDate;


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
                    break;
                case 'b':
                    int edad = 0;
                    System.out.println("Introduce tu edad");
                    edad = scan.nextInt();
                    boolean adulto = isAdult(edad);
                    System.out.println(edad);
                    break;
                case 'c':
                    double radio = 0;
                    System.out.println("Introduce el radio");
                    radio = scan.nextInt();
                    double perimetro = calculateCirclePerimeter(radio);
                    System.out.println(perimetro);
                    break;
                case 'd':
                    radio = 0;
                    System.out.println("Introduce el radio");
                    radio = scan.nextInt();
                    double area = calculateCircleArea(radio);
                    System.out.println(area);
                    break;
                case 'e':
                    int tabla;
                    System.out.println("Introduce la tabla que quieras");
                    tabla = scan.nextInt();

                    switch (tabla) {
                        case 1:
                            tabla = tabla1(tabla);
                            System.out.println(tabla);
                            break;
                        case 2:
                            tabla = tabla2(tabla);
                            System.out.println(tabla);
                            break;
                        case 3:
                            tabla = tabla3(tabla);
                            System.out.println(tabla);
                            break;
                        case 4:
                            tabla = tabla4(tabla);
                            System.out.println(tabla);
                            break;
                        case 5:
                            tabla = tabla5(tabla);
                            System.out.println(tabla);
                            break;
                        case 6:
                            tabla = tabla6(tabla);
                            System.out.println(tabla);
                            break;
                        case 7:
                            tabla = tabla7(tabla);
                            System.out.println(tabla);
                            break;
                        case 8:
                            tabla = tabla8(tabla);
                            System.out.println(tabla);
                            break;
                        case 9:
                            tabla = tabla9(tabla);
                            System.out.println(tabla);
                            break;
                        case 10:
                            tabla = tabla10(tabla);
                            System.out.println(tabla);
                            break;
                        default:
                            System.out.println("No has introducido una tabla valida (1-10)");
                    }

                case 'f':
                    mostrarTablasDel1Al10();

                case 'g':
                    int num = 0;
                    boolean esPrimo;
                    System.out.println("Introduce el numero");
                    num = scan.nextInt();
                    esPrimo = esPrimo(num);
                    System.out.println(esPrimo);
                    if (esPrimo == true) System.out.println("Es primo");
                    else System.out.println("No es primo");
                    break;
                case 'h':
                    int dia, mes, anyo;

                    do {
                        System.out.println("Introduce un año");
                        anyo = scan.nextInt();
                    } while (anyo < 0);

                    do {
                        System.out.println("Introduce un mes (1-12)");
                        mes = scan.nextInt();
                    } while (mes < 0 || mes > 12);

                    do {
                        System.out.println("Introduce un dia (1-31)");
                        dia = scan.nextInt();
                    } while (dia < 1 || dia > 31);

                    boolean fechavalida = validDate(dia, mes, anyo);

                    if (fechavalida == true) {
                        System.out.println("La fecha es valida");
                    } else System.out.println("La fecha no es valida");

                    break;
                case 'i':


                default:
                    System.out.println("No has introducido una opcion valida");

            }
        } while (opcion != 'a' && opcion!= 'b' && opcion!= 'c' && opcion!= 'd' && opcion!= 'e' && opcion!= 'f' && opcion!= 'g' && opcion!= 'h' && opcion!= 'i' );
    }
}
