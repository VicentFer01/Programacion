package Objetos.A2;

import java.util.Arrays;
import java.util.Scanner;

import static Objetos.A2.Persona.buscarPersonaPorDNI;

public class MainPrograma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seleccion;
        Persona[] usuarios = new Persona[10];  // Array de objetos de usuarios

        do {
            System.out.println(
                    "1. Registrar usuario\n" +
                            "2. Gestionar cuentas\n" +
                            "3. Mostrar datos de una persona (por su DNI)\n" +
                            "4. Recibir la nómina mensual de una persona (por DNI y núm de cuenta)\n" +
                            "5. Recibir un pago (por DNI y núm de cuenta)\n" +
                            "6. Realizar transferencia entre cuentas\n" +
                            "7. Imprimir las personas morosas\n" +
                            "8. Salir\n"
            );
            System.out.print("Seleccione una opción: ");
            seleccion = scan.nextInt();

            switch (seleccion) {
                case 1:
                    Persona.registrarPersona(usuarios);
                    System.out.println("Bienvenido a nuestro banco, estos son tus datos");
                    break;

                case 2:
                    Cuenta[] cuentas = Cuenta.anyadirCuentas();
                    System.out.println(Arrays.toString(cuentas));
                    break;

                case 3:
                    System.out.print("Ingrese el DNI de la persona a buscar: ");
                    int dniBuscar = scan.nextInt();
                    Persona personaEncontrada = buscarPersonaPorDNI(usuarios, dniBuscar);
                    if (personaEncontrada != null) {
                        System.out.println("Datos de la persona: " + personaEncontrada);
                    } else {
                        System.out.println("No se encontró ninguna persona con el DNI " + dniBuscar     );
                    }
                    break;
                case 4:
                    Cuenta.recibirNomina();
                case 8:
                    break;


            }

        } while (seleccion != 9);
    }


}
