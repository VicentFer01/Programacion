package Objetos;
import java.util.Scanner;

import static Objetos.Personas.adultAge;

public class PersonasMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String dni1 = "";
        String dni2 = "";

        String apellido1 = null;
        String nombre1 = null;
        int edad1 = 0;
        boolean validDatos1;


        Personas persona1 = new Personas(dni1, nombre1, apellido1, edad1);


        do {
            validDatos1 = true;

            System.out.println("Persona 1 introduce tus datos:");


            System.out.print("Nombre: ");
            nombre1 = scan.next();
            persona1.setNombre(nombre1);

            System.out.print("Apellido: ");
            apellido1 = scan.next();
            persona1.setApellido(apellido1);

            System.out.print("DNI: ");
            String dniInput1 = scan.next();
            boolean validDNI = Personas.checkDNI(dniInput1);
            if (validDNI = true) {
                persona1.setDni(dniInput1);
            } else {
                System.out.println("DNI Invalido");
                validDatos1 = false;
            }

            System.out.print("Edad: ");
            edad1 = scan.nextInt();
            persona1.setDni(String.valueOf(edad1));

            if (!validDatos1) {
                System.out.println("Has introducido datos invalidos, vuelve a rellenarlos");
            }

        } while (!validDatos1);


        boolean validDatos2;
        String nombre2 = "";
        String apellido2 = "";
        int edad2 = 0;


        do {
            validDatos2 = true;

            System.out.println("Persona 2 introduce tus datos:");
            System.out.print("Nombre: ");
            nombre2 = scan.next();

            System.out.print("Apellido: ");
            apellido2 = scan.next();

            System.out.print("DNI: ");
            String dniInput2 = scan.next();
            boolean validDNI2 = Personas.checkDNI(dniInput2);
            if (validDNI2) {
                dni2 = dniInput2;
            } else {
                System.out.println("DNI Invalido");
                validDatos2 = false;
            }

            System.out.print("Edad: ");
            edad2 = scan.nextInt();

            if (!validDatos2) {
                System.out.println("Has introducido datos invalidos, vuelve a rellenarlos");
            }

        } while (!validDatos2);

        Personas persona2 = new Personas(dni2, nombre2, apellido2, edad2);


        System.out.println("Datos de Persona 1:");
        System.out.println(persona1);

        if (persona1.getEdad() < adultAge) {
            System.out.println("La persona 1 es mayor de edad");
        } else {
            System.out.println("La persona 1 no es mayor de edad");

            if (persona1.isRetired(edad1) == true) {
                System.out.println("La persona 1 está retirada");
            } else System.out.println("La persona 1 no esta retirada");


            System.out.println("Datos de Persona 2:");
            System.out.println(persona2);

            if (persona2.isAdult(edad2) == true) {
                System.out.println("La persona 2 es mayor de edad");
            } else {
                System.out.println("La persona 1 no es mayor de edad");

                if (persona2.isRetired(edad2) == true) {
                    System.out.println("La persona 2 está retirada");
                } else System.out.println("La persona 2 no esta retirada");


            }
        }
    }
}
