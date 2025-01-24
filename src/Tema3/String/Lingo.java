package Tema3.String;

import java.util.Scanner;

public class Lingo {

    public static String pista(String hiddenWord, String tryWord) {
        StringBuilder hint = new StringBuilder("-----"); //
        boolean[] used = new boolean[5]; // Para marcar letras ya usadas en la palabra escondida

        for (int i = 0; i < 5; i++) {
            if (hiddenWord.charAt(i) == tryWord.charAt(i)) {
                hint.setCharAt(i, '*'); // Letra correcta en la posición correcta
                used[i] = true; // Marca esta letra como utilizada
            }
        }

        for (int i = 0; i < 5; i++) {
            if (hint.charAt(i) == '-') {
                for (int j = 0; j < 5; j++) {
                    if (!used[j] && hiddenWord.charAt(j) == tryWord.charAt(i)) {
                        hint.setCharAt(i, '-');
                        used[j] = true;
                    }
                }
            }
        }

        return hint.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hiddenWord = "HUESO";

        System.out.println("¡Bienvenido al juego de Lingo!");
        System.out.println("Tienes que adivinar una palabra de 5 letras.");
        System.out.println("Tienes un máximo de 5 intentos.");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < 5 && !guessedCorrectly) {
            System.out.print("Intento " + (attempts + 1) + ": ");
            String tryWord = scanner.nextLine().toUpperCase();

            if (tryWord.length() != 5) {
                System.out.println("ingresa una palabra de 5 letras.");
                continue;
            }

            String hint = pista(hiddenWord, tryWord);
            System.out.println("Pista: " + hint);

            if (tryWord.equals(hiddenWord)) {
                guessedCorrectly = true;
            }

            attempts++;
        }


        if (guessedCorrectly) {
            System.out.println("¡Felicidades, adivinaste la palabra!");
        } else {
            System.out.println("Lo siento, no adivinaste la palabra. La palabra correcta era: " + hiddenWord);
        }

        scanner.close();
    }
}
