package Objetos.A2v2;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponible: " + saldo);
    }

    public void recibirAbono(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Abono recibido. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a abonar debe ser positivo.");
        }
    }

    public void pagarRecibo(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Recibo pagado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta[numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
    }

}
