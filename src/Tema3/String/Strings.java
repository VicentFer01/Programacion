package Tema3.String;

import static Tema3.String.MyString.*;

public class Strings {
    public static void main(String[] args) {
        String string = "Hola quiero irme a ASIR";
        String string2 = "Hola";
        String str = invertirMayusString(string);
        System.out.println(str);

        int vocales = contarVocales(string);
        System.out.println("Hay " + vocales + "vocales");

        String palabraMayor = MyString.palabraMayor(string);
        System.out.println("La palabra mas grande es" + palabraMayor);

        int counter = repitePalabra(string, string2);
        System.out.println("La cadena 2 se repite " + counter + " veces en la cadena 1");






    }
}
