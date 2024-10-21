package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        int mes, anyo;
        boolean esBisiesto;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el año");
        anyo = scan.nextInt();
        System.out.println("Introduce el mes");
        mes  = scan.nextInt();
        int dias = 0;


        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (esBisiesto = true) {
                    dias = 29;
                    System.out.println("El mes es bisiesto");
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("El mes no es valido, bobo");
                return;
        }


            System.out.println("El mes " + mes + " del año " + anyo + " tiene " + dias + " dias");

            if ((anyo % 4 == 0 && anyo % 100 !=0) || (anyo % 400 ==0 )) {
                esBisiesto = true;
            } else {
                esBisiesto = false;
            }

        }
    }

