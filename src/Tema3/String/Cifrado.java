package Tema3.String;

public class Cifrado {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase(); // Asegurarse de que todo esté en mayúsculas

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append((char) ((c - 'A' + shift) % 26 + 'A'));
            } else if (Character.isDigit(c)) {
                result.append((char) ((c - '0' + shift) % 10 + '0'));
            } else {
                // No se modifican otros caracteres
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // Desplazamos la letra hacia atrás por el valor de 'shift'
                result.append((char) ((c - 'A' - shift + 26) % 26 + 'A'));
            } else if (Character.isDigit(c)) {
                // Desplazamos el dígito hacia atrás
                result.append((char) ((c - '0' - shift + 10) % 10 + '0'));
            } else {
                // No se modifican otros caracteres
                result.append(c);
            }
        }
        return result.toString();
    }

    // Método main para probar la implementación
    public static void main(String[] args) {
        String message = "Hola Mundo 123!"; // Ejemplo de mensaje
        int shift = 1; // Valor del desplazamiento para el cifrado

        // Cifrar el mensaje
        String encrypted = encrypt(message, shift);
        System.out.println("Mensaje cifrado: " + encrypted);

        // Descifrar el mensaje
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Mensaje descifrado: " + decrypted);
    }
}
