package Tema3;

import java.util.Scanner;

import static Tema3.Libreria.*;

public class    Tema3Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabla, result = 0;
        int tabla1, tabla2, tabla3, tabla4, tabla5, tabla6, tabla7, tabla8, tabla9, tabla10;
        System.out.println("Que tabla de multiplicar quieres? (1-10)");
        tabla = scan.nextInt();

        switch (tabla) {
            case 1:
                tabla1();
            case 2:
                tabla2();
            case 3:
                tabla3();
            case 4:
                tabla4();
            case 5:
                tabla5();

        }
    }
}
