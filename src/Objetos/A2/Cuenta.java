package Objetos.A2;

import java.util.Scanner;

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

        if (dni)

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
