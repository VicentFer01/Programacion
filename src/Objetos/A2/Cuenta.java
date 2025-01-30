package Objetos.A2;

public class Cuenta {
    private int numCuenta;
    private int saldo;


    public Cuenta(int numCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
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
}
