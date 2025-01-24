package Tema3.String;

import java.util.Scanner;

public class Lingo {

    // Método para generar la pista de un intento
    public static String generateHint(String hiddenWord, String tryWord) {
        StringBuilder hint = new StringBuilder("-----"); // Inicia con 5 guiones
        boolean[] used = new boolean[5]; // Para marcar letras ya usadas en la palabra escondida

        // Primero, verifica las letras en las posiciones correctas
        for (int i = 0; i < 5; i++) {
            if (hiddenWord.charAt(i) == tryWord.charAt(i)) {
                hint.setCharAt(i, '*'); // Letra correcta en la posición correcta
                used[i] = true; // Marca esta letra como utilizada
            }
        }

        // Luego, verifica las letras en posiciones incorrectas
        for (int i = 0; i < 5; i++) {
            if (hint.charAt(i) == '-') { // Solo verificar si aún no es un '*'
                for (int j = 0; j < 5; j++) {
                    if (!used[j] && hiddenWord.charAt(j) == tryWord.charAt(i)) {
                        hint.setCharAt(i, '-'); // Letra está en la palabra pero en posición incorrecta
                        used[j] = true; // Marca la letra de la palabra escondida como usada
                        break;
                    }
                }
            }
        }

        return hint.toString();
    }

    // Método principal del juego
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Palabra secreta de 5 letras
        String hiddenWord = "HUESO"; // Se puede cambiar por cualquier palabra de 5 letras

        // Inicia el juego
        System.out.println("¡Bienvenido al juego de Lingo!");
        System.out.println("Tienes que adivinar una palabra de 5 letras.");
        System.out.println("Tienes un máximo de 5 intentos.");

        int attempts = 0;
        boolean guessedCorrectly = false;

        // Loop para dar 5 intentos al jugador
        while (attempts < 5 && !guessedCorrectly) {
            System.out.print("Intento " + (attempts + 1) + ": ");
            String tryWord = scanner.nextLine().toUpperCase();

            // Verificar si la palabra ingresada es de 5 letras
            if (tryWord.length() != 5) {
                System.out.println("Por favor, ingresa una palabra de 5 letras.");
                continue;
            }

            // Generar la pista (hint)
            String hint = generateHint(hiddenWord, tryWord);
            System.out.println("Pista: " + hint);

            // Verificar si el jugador adivinó la palabra
            if (tryWord.equals(hiddenWord)) {
                guessedCorrectly = true;
            }

            attempts++;
        }

        // Resultado final
        if (guessedCorrectly) {
            System.out.println("¡Felicidades, adivinaste la palabra!");
        } else {
            System.out.println("Lo siento, no adivinaste la palabra. La palabra correcta era: " + hiddenWord);
        }

        scanner.close();
    }
}
