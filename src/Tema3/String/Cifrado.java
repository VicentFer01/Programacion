package Tema3.String;

public class Cifrado {

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) { // Este no lo he hecho yo
            if (Character.isLetter(c)) {
                result.append((char) ((c - 'A' + shift) % 26 + 'A'));
            } else if (Character.isDigit(c)) {
                result.append((char) ((c - '0' + shift) % 10 + '0'));
            } else {
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
                result.append((char) ((c - 'A' - shift + 26) % 26 + 'A'));
            } else if (Character.isDigit(c)) {
                // Desplazamos el dígito hacia atrás
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String message = "Hola Mundo 123!"; // Ejemplo de mensaje
        int shift = 1; // Valor del desplazamiento para el cifrado

        String encrypted = encrypt(message, shift);
        System.out.println("Mensaje cifrado: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Mensaje descifrado: " + decrypted);
    }
}
