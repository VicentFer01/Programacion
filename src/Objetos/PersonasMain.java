package Objetos;

import java.util.Scanner;

public class PersonasMain {
    public static void main(String[] args) {
        String dni1 = "";
        String dni2 = "";
        Scanner scan = new Scanner(System.in);




        System.out.println("Persona 1 introduce tus datos:");
        System.out.print("Nombre: ");
        String nombre1 = scan.next();

        System.out.print("Apellido: ");
        String apellido1 = scan.next();

        System.out.print("DNI: ");
        String dniInput1 = scan.next();
        boolean validDNI = Personas.checkDNI(dniInput1);
        if (validDNI == true)
             dni1 = dniInput1;

        System.out.print("Edad: ");
        int edad1 = scan.nextInt();

        Personas persona1 = new Personas(dni1, nombre1, apellido1, edad1);

        System.out.println("Persona 2 introduce tus datos:");
        System.out.print("Nombre: ");
        String nombre2 = scan.next();

        System.out.print("Apellido: ");
        String apellido2 = scan.next();

        System.out.print("DNI: ");
        String dniInput2 = scan.next();
        boolean validDNI2 = Personas.checkDNI(dniInput1);
        if (validDNI == true)
            dni2 = dniInput2;

        System.out.print("Edad: ");
        int edad2 = scan.nextInt();

        Personas persona2 = new Personas(dni2, nombre2, apellido2, edad2);

        System.out.println("Datos de Persona 1:");
        System.out.println(persona1);

        System.out.println("Datos de Persona 2:");
        System.out.println(persona2);





    }
}
