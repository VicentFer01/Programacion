package Objetos;

import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        Hero heroe1 = new Hero("Placeholder", 1, 200, 200, 0, 30, 5, 5);

        System.out.println("\n" +
                ".___        __                    .___                      __                 .__        __    \n" +
                "|   | _____/  |________  ____   __| _/_ __   ____  ____   _/  |_ __ __    ____ |__| ____ |  | __\n" +
                "|   |/    \\   __\\_  __ \\/  _ \\ / __ |  |  \\_/ ___\\/ __ \\  \\   __\\  |  \\  /    \\|  |/ ___\\|  |/ /\n" +
                "|   |   |  \\  |  |  | \\(  <_> ) /_/ |  |  /\\  \\__\\  ___/   |  | |  |  / |   |  \\  \\  \\___|    < \n" +
                "|___|___|  /__|  |__|   \\____/\\____ |____/  \\___  >___  >  |__| |____/  |___|  /__|\\___  >__|_ \\\n" +
                "         \\/                        \\/           \\/    \\/                     \\/        \\/     \\/\n");
        System.out.println("Nick:");
        String inputName = scan.next();
        heroe1.setName(inputName);

        System.out.println();
        System.out.println("Estos son los detalles de tu personaje:");
        System.out.println(heroe1);

        String enemyName = "Enemy";
        Hero[] enemigos;

        while (heroe1.getHealth() > 0) { // Mientras el héroe tenga vida, el juego sigue
            int hordaNumber = random.nextInt(3) + 1; // Generar horda de 1 a 3 enemigos

            System.out.println();
            System.out.println("\n" +
                    ".____    .__                                                            .__                     \n" +
                    "|    |   |  |   ____   _________    ____     ____   ____   ____   _____ |__| ____   ____  ______\n" +
                    "|    |   |  | _/ __ \\ / ___\\__  \\  /    \\  _/ __ \\ /    \\_/ __ \\ /     \\|  |/ ___\\ /  _ \\/  ___/\n" +
                    "|    |___|  |_\\  ___// /_/  > __ \\|   |  \\ \\  ___/|   |  \\  ___/|  Y Y  \\  / /_/  >  <_> )___ \\ \n" +
                    "|_______ \\____/\\___  >___  (____  /___|  /  \\___  >___|  /\\___  >__|_|  /__\\___  / \\____/____  >\n" +
                    "        \\/         \\/_____/     \\/     \\/       \\/     \\/     \\/      \\/  /_____/            \\/ \n");
            System.out.println();

            enemigos = new Hero[hordaNumber];

            // Crear enemigos
            for (int i = 0; i < hordaNumber; i++) {
                Hero enemy = new Hero(enemyName + " " + (i + 1));
                enemy.setHealth(heroe1.getMaxHealth() / hordaNumber);
                enemy.setMaxHealth(heroe1.getMaxHealth() / hordaNumber);
                enemy.setAttack(heroe1.getAttack() / hordaNumber);
                enemy.setDefense(heroe1.getMaxDefense() / hordaNumber);
                enemigos[i] = enemy;
                System.out.println((i + 1) + ". " + enemy);
            }

            // Batalla con los enemigos
            boolean hordaViva = true; // Verificar si aún quedan enemigos con vida
            while (hordaViva && heroe1.getHealth() > 0) {
                hordaViva = false; // Suponemos que no quedan enemigos vivos


                System.out.println();
                System.out.println("Enemigos disponibles para atacar:");
                for (int i = 0; i < enemigos.length; i++) {
                    if (enemigos[i].getHealth() > 0) {
                        System.out.println((i + 1) + ". " + enemigos[i].getName() + " (Vida: " + enemigos[i].getHealth() + ")");                 // Mostrar enemigos vivos

                    }
                }
                System.out.println();
                System.out.println(heroe1.getName() + " tiene " + heroe1.getHealth() + "puntos de vida");
                System.out.println();
                System.out.println("Selecciona el número del enemigo al que quieres atacar:");
                int seleccion = scan.nextInt() - 1; // Convertir a índice (de 1-3 a 0-2)

                if (seleccion >= 0 && seleccion < enemigos.length && enemigos[seleccion].getHealth() > 0) {
                    Hero enemy = enemigos[seleccion];

                    // Ataque del héroe
                    int heroDamage = heroe1.heroAttack(enemy);
                    System.out.println(heroe1.getName() + " ataca a " + enemy.getName() + " causando " + heroDamage + " de daño.");

                    if (enemy.getHealth() <= 0) { // Si el enemigo muere
                        System.out.println(enemy.getName() + " ha sido derrotado.");
                    } else { // Si el enemigo sigue vivo, contraataca
                        int enemyDamage = enemy.enemyAttack(heroe1);
                        System.out.println(enemy.getName() + " contraataca causando " + enemyDamage + " de daño.");

                        if (heroe1.getHealth() <= 0) { // Si el héroe muere
                            System.out.println(heroe1.getName() + " ha sido derrotado. Fin del juego.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Selección inválida. Por favor, elige un enemigo válido.");
                }

                for (Hero enemy : enemigos) {
                    if (enemy.getHealth() > 0) {
                        hordaViva = true;
                        break;
                    }
                }
            }

            if (!hordaViva) {
                System.out.println();
                System.out.println("Has derrotado a todos los enemigos de la horda.");
                System.out.println();
                heroe1.levelUP();
                System.out.println();
                System.out.println("Tus estadisticas han mejorado, son las siguientes");
                System.out.println();
                System.out.println(heroe1);
            }
        }
    }
}
