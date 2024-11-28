package Tema3;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import static Tema3.Libreria.esBisiesto;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia, mes, anyo;
        boolean validDate = false;

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


        validDate = validDate(dia, mes, anyo);

        if (validDate == true) {
            System.out.println("La fecha es valida");
        } else System.out.println("La fecha no es valida");
    }

    public static boolean validDate(int dia, int mes, int anyo) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia > 31 || dia < 1) {
                    return false;
                } else return true;

            case 2:
                boolean esBisiesto;

                esBisiesto = esBisiesto(dia, mes, anyo);
                if (esBisiesto == true) {
                    System.out.println("El año es bisiesto");

                    if (dia > 29 || dia < 1) {
                        return false;
                    } else return true;

                }

            case 4, 6, 9, 11:
                if (dia > 30 || dia < 1) {
                    return false;
                } else return true;

            default: System.out.println("No es un mes valido");

                }
                return false;
        }
    }



