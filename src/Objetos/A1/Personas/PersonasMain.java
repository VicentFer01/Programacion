package Objetos.A1.Personas;
import java.util.Scanner;

import static Objetos.A1.Personas.Personas.*;

public class PersonasMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int dni1 = 0;
        int dni2 = 0;

        String apellido1 = null;
        String nombre1 = null;
        char letra1 = 0, letra2 = 0;
        int edad1 = 0;
        boolean validDatos1;


        Personas persona1 = new Personas(dni1, letra1,  nombre1, apellido1, edad1);


        do {
            validDatos1 = true;

            System.out.println("Persona 1 introduce tus datos:");


            System.out.print("Nombre: ");
            nombre1 = scan.next();
            persona1.setNombre(nombre1);

            System.out.print("Apellido: ");
            apellido1 = scan.next();
            persona1.setApellido(apellido1);

            System.out.print("DNI (Solo numeros): ");
            int dniInput1 = scan.nextInt();

            System.out.println("DNI Letra: ");
            char dniLetraInput1 = scan.next().charAt(0);


            boolean checkearDNI = checkDNI(dniInput1, dniLetraInput1);
            if (checkearDNI == false) { System.out.println("El dni es invalido"); validDatos1 = false;}
            else persona1.setDni(dniInput1);

            System.out.print("Edad: ");
            edad1 = scan.nextInt();
            persona1.setEdad(edad1);

            if (!validDatos1) {
                System.out.println("Has introducido datos invalidos, vuelve a rellenarlos");
            }

        } while (!validDatos1);


        boolean validDatos2;
        String nombre2 = "";
        String apellido2 = "";
        int edad2 = 0;


        Personas persona2 = new Personas(dni2, letra2,  nombre2, apellido2, edad2);


        do {
            validDatos2 = true;

            System.out.println("Persona 2 introduce tus datos:");
            System.out.print("Nombre: ");
            nombre2 = scan.next();
            persona2.setNombre((nombre2));

            System.out.print("Apellido: ");
            apellido2 = scan.next();
            persona2.setApellido(apellido2);


            System.out.print("DNI (Solo numeros): ");
            int dniInput2 = scan.nextInt();

            System.out.println("DNI Letra: ");
            char dniLetraInput2 = scan.next().charAt(0);


            boolean checkearDNI = checkDNI(dniInput2, dniLetraInput2);
            if (checkearDNI == false) { System.out.println("El dni es invalido"); validDatos2 = false;}
            else persona2.setDni(dniInput2);



            System.out.print("Edad: ");
            edad2 = scan.nextInt();
            persona2.setEdad(edad2);

            if (!validDatos2) {
                System.out.println("Has introducido datos invalidos, vuelve a rellenarlos");
            }

        } while (!validDatos2);



        System.out.println("Datos de Persona 1:");
        System.out.println(persona1);

        if (persona1.getEdad() > adultAge) {
            System.out.println("La persona 1 es mayor de edad");
        } else {
            System.out.println("La persona 1 no es mayor de edad");
        }

            if (persona1.getEdad() > retiredAge) {
                System.out.println("La persona 1 está retirada");
            } else System.out.println("La persona 1 no esta retirada");

            System.out.println();
            System.out.println();



            System.out.println("Datos de Persona 2:");
            System.out.println(persona2);

            if (persona2.getEdad() > adultAge) {
                System.out.println("La persona 2 es mayor de edad");
            } else {
                System.out.println("La persona 2 no es mayor de edad"); }


            if (persona2.getEdad() > retiredAge) {
                System.out.println("La persona 2 está retirada");
            } else {
                System.out.println("La persona 2 no esta retirada");
            }

            }
        }
    
