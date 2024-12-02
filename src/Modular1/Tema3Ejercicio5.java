package Modular1;

import java.util.Scanner;

import static Modular1.Libreria.*;

public class    Tema3Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabla, result = 0;
        int tabla1 = 0, tabla2, tabla3, tabla4, tabla5, tabla6, tabla7, tabla8, tabla9, tabla10;
        System.out.println("Que tabla de multiplicar quieres? (1-10)");
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

        }
    }
}
