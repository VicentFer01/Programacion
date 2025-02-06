package Objetos.A2;

import java.util.Scanner;

import static Objetos.A2.Persona.buscarPersonaPorDNI;

public class Cuenta {
    private int numCuenta;
    private int saldo;


    public Cuenta(int numCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public static Cuenta[] anyadirCuentas() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce tu dni");
        int dni = scan.nextInt();

        System.out.println("Introduce cuantas cuentas quieres (Max 3)");
        int numCuentasPersona = scan.nextInt();

        Cuenta[] cuentas = new Cuenta[numCuentasPersona]; // Array de cuentas con longitud de la cantidad de cuentas


        for (int i = 0; i < numCuentasPersona; i++) {
            System.out.println("Introduce el numero de la cuenta");
            int inputCuenta = scan.nextInt();

            System.out.println("Introduce el saldo");
            int inputSaldo = scan.nextInt();

            cuentas[i] = new Cuenta(inputCuenta, inputSaldo); // Cada indice es un objeto de la array
        }
        return cuentas;
    }

    private static void recibirNomina(Persona[] usuarios, Scanner scan) {
        System.out.print("Ingrese el DNI de la persona: ");
        int dniBuscado = scan.nextInt();
        scan.nextLine(); // Limpiar buffer

        // Buscar la persona por su DNI
        Persona persona = buscarPersonaPorDNI(usuarios, dniBuscado);

        if (persona == null) {
            System.out.println("No se encontró una persona con ese DNI.");

        }

        if (persona.getCuentasBancarias() == null || persona.getCuentasBancarias().length == 0) {
            System.out.println("La persona no tiene cuentas bancarias registradas.");

        }

        System.out.println("Cuentas disponibles:");
        for (int i = 0; i < persona.getCuentasBancarias().length; i++) {
            System.out.println((i + 1) + ". " + persona.getCuentasBancarias()[i]);
        }

        System.out.print("Seleccione el número de cuenta (1, 2, etc.): ");
        int indiceCuenta = scan.nextInt() - 1;

        if (indiceCuenta < 0 || indiceCuenta >= persona.getCuentasBancarias().length) {
            System.out.println("Selección inválida.");
            return;
        }

        Cuenta cuentaSeleccionada = persona.getCuentasBancarias()[indiceCuenta];

        System.out.print("Ingrese el monto de la nómina: ");
        double monto = scan.nextDouble();

        cuentaSeleccionada.depositar(monto); // Método que deposita el dinero en la cuenta

        System.out.println("Nómina de " + monto + " depositada correctamente en la cuenta " + cuentaSeleccionada.getNumeroCuenta());
    }



    public void checkSaldo(int saldo) {
        System.out.println("El saldo de esta cuenta es" + this.saldo);
    }

    public void recibirAbono(int saldo, int abono) {
        saldo = saldo + abono;
        System.out.println("Has recibido un abono de " + abono + " euros, eso suma " + saldo + " a tu cuenta");
    }

    public void pagarRecibo(int saldo, int recibo) {
        this.saldo = this.saldo - recibo;

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
