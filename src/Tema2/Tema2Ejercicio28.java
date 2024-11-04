package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        int guessCounter = 0;
        int guess;
        System.out.println("Introduce el numero que creas que es");

        for (guessCounter = 1; guessCounter <= 5; guessCounter++) {
            guess = scan.nextInt();

            if (guess == randomInt) {
                System.out.println("Has acertado el número");
                break;
            } else {
                System.out.println("No has acertado el número");
                if (guessCounter == 5) {
                    System.out.println("Has alcanzado el límite de intentos. El número era: " + randomInt);
                }
            }
        }
        scan.close();
        }
    }

