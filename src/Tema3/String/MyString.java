package Tema3.String;

public class MyString {
    public static String invertirMayusString(String string){
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


    
}
