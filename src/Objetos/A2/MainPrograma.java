package Objetos.A2;

import java.util.Arrays;
import java.util.Scanner;

import static Objetos.A2.Persona.buscarPersonaPorDNI;
import static Objetos.A2.Persona.usuarioRegistrado;

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
                    System.out.println("Introduce tu DNI:");
                    int dni = scan.nextInt();

                    Persona persona = new Persona(dni);
                    for (int i = 0; i < usuarios.length; i++) {
                        if (usuarios[i] == null) {
                            usuarios[i] = persona;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Introduce tu DNI:");
                    dni = scan.nextInt();

                    boolean registrado = usuarioRegistrado(usuarios, dni); // primero compruebo si el usuario esta registrao

                    if (registrado == true) { // Si
                        System.out.println("Introduce cuántas cuentas quieres (Máx 3):");
                        int numCuentasPersona = scan.nextInt();

                         persona = buscarPersonaPorDNI(usuarios, dni);

                        Cuenta[] cuentas = new Cuenta[numCuentasPersona]; // aqui creo el array de cuentas de la clase cuenta

                        for (int i = 0; i < numCuentasPersona; i++) { // el bucle que crea los objetos de cuenta
                            System.out.println("Introduce el número de cuenta:");
                            int numeroCuenta = scan.nextInt();

                            System.out.println("Intrdouce el saldo inicial");
                            int saldoCuenta = scan.nextInt();

                            cuentas[i] = new Cuenta(numeroCuenta, dni, saldoCuenta); // crear los objetos de cuenta
                        }

                        persona.setCuentasBancarias(cuentas); // asignar las cuentas a la persona

                        System.out.println("Cuentas registradas correctamente.");
                    } else {
                        System.out.println("El usuario con ese DNI no está registrado.");
                    }
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
                    System.out.println("Introduce tu dni");
                    dniBuscar = scan.nextInt();

                    registrado = usuarioRegistrado(dniBuscar);



                    }


                case 8:
                    break;


            }

        } while (seleccion != 8);
    }


}
