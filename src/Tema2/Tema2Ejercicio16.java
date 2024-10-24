package Tema2;
import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe D para convertir de euros a dolares o E para convertir de dolares a euros:");
        char input = scan.next().charAt(0);

        System.out.println("Introduce la cantidad de dinero a convertir:");
        double cantidad = scan.nextDouble();

        double total;

        switch (input) {
            case 'D':
                total = cantidad * 1.08;
                System.out.println("El total de euros a dólares es " + total);
                break;
            case 'E':
                total = cantidad * 0.92;
                System.out.println("El total de dólares a euros es " + total);
                break;
            default:
                System.out.println("No se ha introducido una opción válida.");
        }
        scan.close();
    }
}

