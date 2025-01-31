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
        String[] palabras = string.split(" ");

        for (String palabra : palabras) {
            if (palabra.equalsIgnoreCase(string2)) {
                counter++;
            }
            ;

        }
        return counter;
    }


    public static String formatearTelefono(String numero) {
        if (!numero.matches("\\d{11}")) { // Asegura que sean 11 dígitos numéricos
            return "Número inválido";
        }
        String codigoPais = numero.substring(0, 2);
        String parte1 = numero.substring(2, 5);
        String parte2 = numero.substring(5);
        return "(+" + codigoPais + ")-" + parte1 + "-" + parte2;
    }


    public static void mostrarHistogramaVocales(String texto) {
        int[] frecuencias = new int[5];
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (char c : texto.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a' -> frecuencias[0]++;
                case 'e' -> frecuencias[1]++;
                case 'i' -> frecuencias[2]++;
                case 'o' -> frecuencias[3]++;
                case 'u' -> frecuencias[4]++;
            }
        }

        for (int i = 0; i < vocales.length; i++) {
            System.out.print(vocales[i] + ": ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + frecuencias[i] + ")");
        }
    }

    }

