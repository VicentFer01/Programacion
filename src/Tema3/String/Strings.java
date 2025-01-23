package Tema3.String;

import static Tema3.String.MyString.contarVocales;
import static Tema3.String.MyString.invertirMayusString;

public class Strings {
    public static void main(String[] args) {
        String string = "Hola quiero irme a ASIR";
        String str = invertirMayusString(string);
        System.out.println(str);

        int vocales = contarVocales(string);
        System.out.println("Hay " + vocales + "vocales");

        String palabraMayor = MyString.palabraMayor(string);
        System.out.println("La palabra mas grande es" + palabraMayor);







    }
}
