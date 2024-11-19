package Tema2v2;

import java.util.Scanner;

public class T24v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aprobados = 0, suspendidos = 0;
        double nota;

        do {
            System.out.println("Introduce la nota del alumno");
            nota = scan.nextDouble();

            if (nota >= 5 && nota <= 10) {
                aprobados++; }
           if (nota > 0 && nota < 5) { suspendidos++; }


                System.out.println("Aprobados:" + aprobados);
                System.out.println("Suspendidos:" + suspendidos);



        } while (nota > 0 && nota <= 10.0);
    }
}

