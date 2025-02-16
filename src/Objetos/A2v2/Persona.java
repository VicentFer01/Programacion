package Objetos.A2v2;

public class Persona {
    private String dni;
    private Cuenta[] cuentas;
    private int numCuentas;

    public Persona(String dni) {
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.numCuentas = 0;
    }

    public String getDni() {
        return dni;
    }

    public int getNumCuentas() {
        return numCuentas;
    }

    public void añadirCuenta(Cuenta cuenta) {
        if (numCuentas < 3) {
            cuentas[numCuentas] = cuenta;
            numCuentas++;
            System.out.println("Cuenta añadida exitosamente.");
        } else {
            System.out.println("No se pueden añadir más cuentas. Máximo alcanzado.");
        }
    }

    public Cuenta buscarCuenta(String numeroCuenta) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numeroCuenta)) {
                return cuentas[i];
            }
        }
        return null;
    }

    public boolean esMorosa() {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }

    public void mostrarDatos() {
        System.out.println(dni);

        for (int i = 0; i < numCuentas; i++) {
            System.out.println(cuentas[i].getNumeroCuenta() + " " + cuentas[i].getSaldo());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona[dni=").append(dni).append(", cuentas=[");

        for (int i = 0; i < numCuentas; i++) {
            sb.append(cuentas[i].toString());
            if (i < numCuentas - 1) {
                sb.append(", "); // Agrega coma entre cuentas
            }
        }

        sb.append("]]");
        return sb.toString();
    }


}
