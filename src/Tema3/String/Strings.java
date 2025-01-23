package Tema3.String;

import static Tema3.String.MyString.contarVocales;
import static Tema3.String.MyString.invertirMayusString;

public class Strings {
    public static void main(String[] args) {
        String string = "Hola";
        int vocales = contarVocales(string);
        System.out.println("Hay " + vocales + " vocales");
    }
}
