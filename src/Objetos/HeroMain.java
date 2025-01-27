package Objetos;

import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        Hero heroe1 = new Hero("Placeholder", 1, 200, 200, 0, 30, 5, 5);

        System.out.println("Nombre:");
        String inputName = scan.next();
        heroe1.setName(inputName);

        System.out.println("Estos son los detalles de tu personaje:");
        System.out.println(heroe1);

        String enemyName = "Enemy";
        Hero[] enemigos;

        while (heroe1.getHealth() > 0) { // Mientras el héroe tenga vida, el juego sigue
            int hordaNumber = random.nextInt(3) + 1; // Generar horda de 1 a 3 enemigos

            System.out.println();
            System.out.println("Llega una horda de " + hordaNumber + " enemigos:");
            System.out.println();

            enemigos = new Hero[hordaNumber];

            // Crear enemigos
            for (int i = 0; i < hordaNumber; i++) {
                Hero enemy = new Hero(enemyName + " " + i);
                enemy.setHealth(heroe1.getMaxHealth() / hordaNumber);
                enemy.setMaxHealth(heroe1.getMaxHealth() / hordaNumber);
                enemy.setAttack(heroe1.getAttack() / hordaNumber);
                enemy.setDefense(heroe1.getMaxDefense() / hordaNumber);
                enemigos[i] = enemy;
                System.out.println(enemy);
            }

            // Batalla con los enemigos
            boolean hordaViva = true; // Verificar si aún quedan enemigos con vida
            while (hordaViva && heroe1.getHealth() > 0) {
                hordaViva = false; // Suponemos que no quedan enemigos vivos

                for (int i = 0; i < enemigos.length; i++) {
                    Hero enemy = enemigos[i];

                    if (enemy.getHealth() > 0) { // Solo interactuar si el enemigo está vivo
                        hordaViva = true; // Hay al menos un enemigo vivo

                        System.out.println();
                        System.out.println("Escribe 1 para atacar a " + enemy.getName());
                        int seleccion = scan.nextInt();

                        if (seleccion == 1) {
                            int heroDamage = heroe1.heroAttack(enemy); // Daño del héroe al enemigo
                            System.out.println(heroe1.getName() + " ataca a " + enemy.getName() + " causando " + heroDamage + " de daño.");
                            System.out.println(enemy.getName() + " tiene " + enemy.getHealth() + " puntos de vida");

                            if (enemy.getHealth() <= 0) { // Si el enemigo muere
                                System.out.println(enemy.getName() + " ha sido derrotado.");
                            } else { // Si el enemigo sigue vivo, contraataca
                                int enemyDamage = enemy.enemyAttack(heroe1);
                                System.out.println(enemy.getName() + " contraataca causando " + enemyDamage + " de daño.");
                                System.out.println(heroe1.getName() + " tiene ahora " + heroe1.getHealth() + " puntos de vida");

                                if (heroe1.getHealth() <= 0) { // Si el héroe muere
                                    System.out.println(heroe1.getName() + " ha sido derrotado. Fin del juego.");
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            if (!hordaViva) {
                System.out.println("Has derrotado a todos los enemigos de la horda.");
            }
        }
    }
}
