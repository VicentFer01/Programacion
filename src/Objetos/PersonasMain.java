package Objetos;

import java.util.Scanner;


public class PersonasMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nombre1 = "", apellido1 = "", dni1 = "";
        int edad1 = 0;

        String nombre2 = "", apellido2 = "", dni2 = "";
        int edad2 = 0;

        System.out.println("Persona 1 introduce tus datos");
        System.out.println("Nombre");
        nombre1 = scan.next();
        System.out.println("Apellido");
        apellido1 = scan.next();
        System.out.println("DNI");
        dni1 = scan.next();
        System.out.println("Edad");
        edad1 = scan.nextInt();

        // Create persona1 object with the collected data
        Persona persona1 = new Persona(nombre1, apellido1, dni1, edad1);

        // Ask for Persona 2 data
        System.out.println("Persona 2 introduce tus datos");
        System.out.println("Nombre");
        nombre2 = scan.next();
        System.out.println("Apellido");
        apellido2 = scan.next();
        System.out.println("DNI");
        dni2 = scan.next();
        System.out.println("Edad");
        edad2 = scan.nextInt();

        // Create persona2 object with the collected data
        Persona persona2 = new Persona(nombre2, apellido2, dni2, edad2);

        // Optionally, you can display the details of both personas
        System.out.println("\nDatos de Persona 1:");
        System.out.println(persona1); // Assuming Persona has a proper toString() method

        System.out.println("\nDatos de Persona 2:");
        System.out.println(persona2); // Assuming Persona has a proper toString() method
    }
}
