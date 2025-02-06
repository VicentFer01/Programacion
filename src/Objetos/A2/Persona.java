package Objetos.A2;

import java.util.Arrays;
import java.util.Scanner;

public class Persona {
    private static int DNI;
    private Cuenta[] cuentasBancarias;


    public Persona(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI=" + DNI +
                ", cuentasBancarias=" + Arrays.toString(cuentasBancarias) +
                '}';
    }




    public static void registarPersona(Persona[] usuarios) {
        Scanner scan = new Scanner(System.in);

        Persona persona = new Persona(DNI);
        System.out.println("Introduce tu dni");
        int dni = scan.nextInt();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = persona;
                i += usuarios.length +1;
            }


        }
¡    }
}
