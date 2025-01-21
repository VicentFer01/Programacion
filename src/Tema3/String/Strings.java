package Tema3.String;

import static Tema3.String.MyString.invertirMayusString;

public class Strings {
    public static void main(String[] args) {
        String string = "Hola odio esta asignatura quiero irme a ASIR";
        String str = invertirMayusString(string);
        System.out.println(str);
    }
}
