package Objetos.A2;

import java.util.Arrays;
import java.util.Scanner;

public class Persona {
    private int DNI;
    public Cuenta[] cuentasBancarias;

    public Persona(int DNI) {
        this.DNI = DNI;
        cuentasBancarias = new Cuenta[3];
    }

    public Cuenta[] getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(Cuenta[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }








    public static Persona buscarPersonaPorDNI(Persona[] usuarios, int dni) {
        for (Persona usuario : usuarios) { // aqui se recorre la array de los usuarios con un for-each
            if (usuario != null && usuario.getDNI() == dni) {
                return usuario;
            }
        }
        return null;
    }

    public static boolean usuarioRegistrado(Persona[]usuarios, int dni) {
        for (Persona usuario : usuarios) { // aqui se recorre la array de los usuarios con un for-each
            if (usuario != null && usuario.getDNI() == dni) {
                return true;
            } else return false;
        }
        return false;
    }

    public void recibirNomina() {

    }


    @Override
    public String toString() {
        return "Persona{" +
                "DNI=" + DNI +
                ", cuentasBancarias=" + Arrays.toString(cuentasBancarias) +
                '}';
    }
}

