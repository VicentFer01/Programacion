package Objetos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        Hero heroe1 = new Hero("Placeholder", 1, 100, 100, 0, 20, 10, 15);

        System.out.println("Nombre:");
        String inputName = scan.next();
        heroe1.setName(inputName);

        System.out.println("Estos son los detalles de tu personaje:");
        System.out.println(heroe1);

        // Generar enemigos
        int hordaNumber = random.nextInt(3) + 1;
        String enemyName = "Enemy";

        System.out.println("\nLlega una horda de " + hordaNumber + " enemigos:\n");

        Hero[] enemigos = new Hero[hordaNumber];
        for (int i = 0; i < hordaNumber; i++) {
            Hero enemy = new Hero(enemyName + " " + i);
            enemy.setHealth(random.nextInt(100) + 50);
            enemy.setMaxHealth(enemy.getHealth());
            enemy.setAttack(random.nextInt(20) + 10);
            enemy.setDefense(random.nextInt(10) + 5);
            enemigos[i] = enemy;
            System.out.println(enemy);
        }

        // Combate
        while (heroe1.getHealth() > 0) {
            for (int i = 0; i < enemigos.length; i++) {
                Hero enemy = enemigos[i];

                if (enemy.getHealth() > 0) {
                    System.out.println("Escribe 1 para atacar a " + enemy.getName());
                    int seleccion = scan.nextInt();
                    switch (seleccion) {
                        case 1:  int heroDamage = heroe1.heroAttack(enemy);
                            System.out.println(heroe1.getName() + " ataca a " + enemy.getName() + " causando " + heroDamage + " de daño.");


                    }

                 if (enemy.getHealth() <= 0) {
                        System.out.println(enemy.getName() + " ha sido derrotado.");
                    } else {
                    int enemyDamage = enemy.enemyAttack(heroe1);
                        System.out.println(enemy.getName() + " contraataca causando " + enemyDamage + " de daño.");

                        if (heroe1.getHealth() <= 0) {
                            System.out.println("El héroe ha sido derrotado. Fin del juego.");
                        }
                    }
                }
            }
        }

        if (heroe1.getHealth() > 0) {
            System.out.println("¡Has derrotado a todos los enemigos!");
        } else {
            System.out.println("El héroe ha caído en batalla.");
        }
    }
}
