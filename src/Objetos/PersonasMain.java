package Objetos;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class PersonasMain {
    public static void main(String[] args) {
        String dni1 = "";
        String dni2 = "";
        Scanner scan = new Scanner(System.in);

        String apellido1 = null;
        String nombre1 = null;
        int edad1 = 0;

        Personas persona1 = new Personas(dni1, nombre1, apellido1, edad1);


        boolean validDatos1;


        do {
            validDatos1 = true;
            System.out.println("Persona 1 introduce tus datos:");
            System.out.print("Nombre: ");
            nombre1 = scan.next();

            System.out.print("Apellido: ");
            apellido1 = scan.next();

            System.out.print("DNI: ");
            String dniInput1 = scan.next();
            boolean validDNI = Personas.checkDNI(dniInput1);
            if (validDNI == true)
                persona1.setDni(String.valueOf(Integer.parseInt(dniInput1)));
            else validDatos1 = false;


            System.out.print("Edad: ");
            edad1 = scan.nextInt();

            if (validDatos1 == false) System.out.println("Has introducido datos invalidos, vuelve a rellenarlos");

        } while (validDatos1 == false);



        boolean validDatos2 = false;
        String nombre2 = "";
        String apellido2 = "";
        int edad2 = 0;
        
        
        Personas persona2 = new Personas(dni2, nombre2, apellido2, edad2);


        do {
            System.out.println("Persona 2 introduce tus datos:");
            System.out.print("Nombre: ");
            nombre2 = scan.next();

            System.out.print("Apellido: ");
            apellido2 = scan.next();

            System.out.print("DNI: ");
            String dniInput2 = scan.next();
            boolean validDNI2 = Personas.checkDNI(dniInput2);
            if (validDNI2 == true)
                persona2.setDni(String.valueOf(Integer.parseInt(dniInput2)));
            else System.out.println("DNI Invalido"); validDatos2 = false;



            System.out.print("Edad: ");
            edad2 = scan.nextInt();

            if (validDatos2 == false) System.out.println("Has introducido datos invalidos, vuelve a rellenarlos");



        } while (validDatos2 == false);



        System.out.println("Datos de Persona 1:");
        System.out.println(persona1);

        System.out.println("Datos de Persona 2:");
        System.out.println(persona2);


    }
}
