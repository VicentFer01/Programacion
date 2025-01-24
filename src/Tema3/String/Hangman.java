package Tema3.String;

import java.util.Scanner;

public class Hangman {

    public static void printearAhorcado(int attempts) {
        switch (attempts) {
            case 1:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 2:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |     |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 3:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 4:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 5:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    /");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            case 6:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    / \\");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
                break;
            default:
                break;
        }
    }

    public static void progreso(String word, String guessedLetters) {
        StringBuilder display = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters.indexOf(word.charAt(i)) >= 0) {
                display.append(word.charAt(i));
            }
        }
        System.out.println(display.toString());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1, ingresa una palabra secreta:");
        String word = scanner.nextLine().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        String guessedLetters = "";
        int attempts = 0;
        boolean solved = false;

        while (attempts < 6) {
            System.out.println("Palabra actual:");
            progreso(word, guessedLetters);
            System.out.println("Intentos restantes: " + (6 - attempts));
            printearAhorcado(attempts);

            System.out.println("Adivina una letra o escribe 'resolver' para intentar resolver:");
            String guess = scanner.nextLine().toUpperCase();

            if (guess.equals("RESOLVER")) {
                System.out.println("Escribe tu solución:");
                String solution = scanner.nextLine().toUpperCase();
                if (solution.equals(word)) {
                    solved = true;
                    break;
                } else {
                    attempts++;
                }
            } else if (guess.length() == 1 && Character.isLetter(guess.charAt(0))) {
                char guessedChar = guess.charAt(0);
                if (guessedLetters.indexOf(guessedChar) == -1) {
                    guessedLetters += guessedChar;
                    if (word.indexOf(guessedChar) == -1) {
                        attempts++;
                    }
                } else {
                    System.out.println("Ya adivinaste esa letra.");
                }
            } else {
                System.out.println("Entrada no válida.");
            }
        }

        if (solved) {
            System.out.println("¡Felicidades, adivinaste la palabra!");
        } else {
            System.out.println("¡Has perdido! La palabra era: " + word);
        }

    }
}
