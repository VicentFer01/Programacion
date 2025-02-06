package Objetos.A2;

import java.util.Arrays;
import java.util.Scanner;

public class MainPrograma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seleccion;
        Persona[] usuarios = new Persona[10];  // Array de objetos de usuarios

        do {
            System.out.println();
            System.out.println(
                    "1. Registrar usuario\n" +
                    "2. Gestionar cuentas.\n" +
                    "3. Mostrar datos de una persona (por su dni).\n" +
                    "4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).\n" +
                    "5. Recibir un pago (por dni y núm de cuenta).\n" +
                    "6. Realizar transferencia entre cuentas.\n" +
                    "7. Imprimir las personas morosas.");

            seleccion = scan.nextInt();

            switch (seleccion) {
                case 1:
                    Persona persona = Persona.registarPersona(usuarios);
                    System.out.println("Bienvenido a nuestro banco, estos son tus datos");
                    System.out.println(persona);
                    break;


                case 2:
                    Cuenta[] cuentas = Cuenta.anyadirCuentas();
                    System.out.println(Arrays.toString(cuentas));



                case 3:
                case 4:
                case 5:
                case 6:
                case 7:

            }


        } while (seleccion != 8);

    }


}
