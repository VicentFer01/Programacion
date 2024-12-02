package Modular1;

import java.util.Scanner;

import static Modular1.Libreria.Libreria1.*;


public class Tema3Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        int totaleuros, totaldolares;
        double euros, dolares, result;

        do {
            showMenu();
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cuantos euros a dolares quieres?");
                    totaleuros = scan.nextInt();
                    result = euro2dollar(totaleuros);
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Cuantos dolares a euros quieres?");
                    totaldolares = scan.nextInt();
                    result = dollar2euro(totaldolares);
                    System.out.println(result);
                    break;
            }
        } while (option != 3);
    }
}
