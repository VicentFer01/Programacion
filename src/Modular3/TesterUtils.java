package Modular3;

import java.util.Scanner;

public class TesterUtils {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dni = scan.nextInt();
        char letraDNI = Utils.getLetraDNI(dni);
        System.out.println(letraDNI);

        boolean validNIF = Utils.isValidNIF(dni);
        if (validNIF == true) { System.out.println("El DNI es valido"); }
            else {
                System.out.println("El DNI no es valido");

            }
        }
    }

