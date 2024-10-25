package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora, minutos, segundos;
        double horafinal;


        System.out.println("Introduce lahora que quieras:");
        hora = scan.nextInt();
        System.out.println("Introduce los minutos:");
        minutos = scan.nextInt();
        System.out.println("Introduce la cantidad de segundos:");
        segundos = scan.nextInt();

        if (hora == 23 && minutos == 59 && segundos == 59)
            System.out.println("La hora es 00:00:00");


        if (hora > 24 || hora > 59 || segundos > 59) {
            System.out.println("La hora no es valida");
        } else {
            horafinal = segundos + 1;
            System.out.println("La hora final es " + hora + " horas " + minutos + " minutos " + horafinal + " segundos");
            scan.close();
        }




    }
}
