package Tema3.String;

public class MyString {
    public static String invertirMayusString(String string) {
        String StrFinal;
        StrFinal = string.toUpperCase();

        for (int i = string.length() - 1; i >= 0; i--) {
            StrFinal += string.charAt(i);  // Agregar el carácter al final de la nueva cadena
        }
        StrFinal = StrFinal.toUpperCase();
        return StrFinal;
    }

    public static int contarVocales(String string) {
        int vocales = 0;
        string = string.toUpperCase();
        string = string.trim();
        char[] array = string.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A' || array[i] == 'E' || array[i] == 'I' || array[i] == 'O' || array[i] == 'U') {
                vocales++;
            }
        }
        return vocales;

    }



    public static String palabraMayor(String string) {
        String[] palabras = string.split(" ");
        String palabraMayor = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }
        }

        return palabraMayor;

    }

    public static int repitePalabra(String string, String string2) {
        int counter = 0;
        String palabra = "";
        String[] palabras = string.split(" ");
        /*
        for (int i = 0; palabra < palabras; i++) {
            if (palabra.equalsIgnoreCase(string2)) { counter++;
            } ;

        }

         */
        return 0;
    }



}
