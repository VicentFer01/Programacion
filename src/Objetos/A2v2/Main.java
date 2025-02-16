package Objetos.A2v2;

import java.util.Scanner;

public class Main {
    private static Persona[] personas = new Persona[10];
    private static int numPersonas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Registrar persona");
            System.out.println("2. Añadir cuenta");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Recibir nomina ");
            System.out.println("5. Recibir pago");
            System.out.println("6. Realizar transferencia entre cuentas");
            System.out.println("7. Imprimir personas morosas");
            System.out.println("8. Salir");
            System.out.print("Elige: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    instanciarPersona();
                    break;
                case 2:
                    instanciarCuenta();
                    break;
                case 3:
                    mostrarDatosPersona();
                    break;
                case 4:
                    recibirNomina();
                    break;
                case 5:
                    recibirPago();
                    break;
                case 6:
                    realizarTransferencia();
                    break;
                case 7:
                    imprimirMorosos();
                    break;
                case 8:
                    System.out.println("adeu");
                    break;
            }
        } while (opcion != 8);
    }

    private static void instanciarPersona() {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = scanner.nextLine();
        Persona persona = new Persona(dni);
        personas[numPersonas] = persona;
        numPersonas++;
        System.out.println("Persona creada exitosamente.");
    }

    private static Persona buscarPersona(String dni) {
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].getDni().equals(dni)) {
                return personas[i];
            }
        }
        return null;
    }

    private static void instanciarCuenta() {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = scanner.nextLine();
        Persona persona = buscarPersona(dni);

        if (persona != null) {
            System.out.print("Introduce el numero de cuenta que quieras: ");
            String numeroCuenta = scanner.nextLine();
            System.out.print("Introduce el saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine();

            Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial);
            persona.añadirCuenta(cuenta);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void mostrarDatosPersona() {
        System.out.print("Introduce el DNI de la persona: ");
        String dni = scanner.nextLine();
        Persona persona = buscarPersona(dni);

        if (persona != null) {
            System.out.println(persona);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void recibirNomina() {
        System.out.print("Introduce el DNI: ");
        String dni = scanner.nextLine();
        Persona persona = buscarPersona(dni);

        if (persona != null) {
            System.out.print("Introduce el número de cuenta: ");
            String numeroCuenta = scanner.nextLine();
            Cuenta cuenta = persona.buscarCuenta(numeroCuenta);

            if (cuenta != null) {
                System.out.print("Introduce el monto de la nómina: ");
                double monto = scanner.nextDouble();
                scanner.nextLine();
                cuenta.recibirAbono(monto);
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void imprimirMorosos() {
        System.out.println("Personas morosas:");
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].esMorosa()) {
                System.out.println("DNI: " + personas[i].getDni());
            }
        }
    }

    private static void realizarTransferencia() {
        System.out.print("Introduce el DNI del remitente: ");
        String dniRemitente = scanner.nextLine();
        Persona remitente = buscarPersona(dniRemitente);

        if (remitente != null) {
            System.out.print("Introduce el número de cuenta origen: ");
            String numeroCuentaOrigen = scanner.nextLine();
            Cuenta cuentaOrigen = remitente.buscarCuenta(numeroCuentaOrigen);

            if (cuentaOrigen != null) {
                System.out.print("Introduce el DNI del destinatario: ");
                String dniDestinatario = scanner.nextLine();
                Persona destinatario = buscarPersona(dniDestinatario);

                if (destinatario != null) {
                    System.out.print("Introduce el número de cuenta destino: ");
                    String numeroCuentaDestino = scanner.nextLine();
                    Cuenta cuentaDestino = destinatario.buscarCuenta(numeroCuentaDestino);

                    if (cuentaDestino != null) {
                        System.out.print("Introduce el monto a transferir: ");
                        double monto = scanner.nextDouble();
                        scanner.nextLine();

                        if (monto > 0 && cuentaOrigen.getSaldo() >= monto) {
                            cuentaOrigen.pagarRecibo(monto);  // Descuenta el monto de la cuenta origen
                            cuentaDestino.recibirAbono(monto);  // Suma el monto a la cuenta destino
                            System.out.println("Transferencia realizada exitosamente.");
                        } else {
                            System.out.println("Saldo insuficiente o monto inválido.");
                        }
                    } else {
                        System.out.println("Cuenta destino no encontrada.");
                    }
                } else {
                    System.out.println("Destinatario no encontrado.");
                }
            } else {
                System.out.println("Cuenta origen no encontrada.");
            }
        } else {
            System.out.println("Remitente no encontrado.");
        }
    }

    private static void recibirPago() {
        System.out.print("Introduce el DNI de la persona que recibe el pago: ");
        String dni = scanner.nextLine();
        Persona persona = buscarPersona(dni);

        if (persona != null) {
            System.out.print("Introduce el número de cuenta donde recibir el pago: ");
            String numeroCuenta = scanner.nextLine();
            Cuenta cuenta = persona.buscarCuenta(numeroCuenta);

            if (cuenta != null) {
                System.out.print("Introduce el monto del pago: ");
                double monto = scanner.nextDouble();
                scanner.nextLine();

                if (monto > 0) {
                    cuenta.recibirAbono(monto);
                    System.out.println("Pago recibido exitosamente.");
                } else {
                    System.out.println("El monto debe ser positivo.");
                }
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
}
