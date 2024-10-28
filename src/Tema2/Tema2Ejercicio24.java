package Tema2;

import javax.swing.*;
import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aprobados = 0;
        int suspendidos = 0;
        double nota;

        System.out.println("Introduce las notas de los alumnos");

        while (true) {
            System.out.println("Nota del alumno: ");
            nota = scan.nextDouble();

            if (nota < 0) {
                break;
            }
            if (nota > 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
            System.out.println("Total de aprobados " + aprobados);
            System.out.println("Total de suspendidos " + suspendidos);

        }
    }
}
