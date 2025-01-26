package Objetos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        Hero heroe1 = new Hero("Placeholder", 0, 0, 0, 0, 0, 0);


        System.out.println("Nombre:");
        String inputName = scan.next();
        heroe1.setName(inputName);

        System.out.println("Estos son los detalles de tu personaje");
        System.out.println(heroe1);


        // Generar enemigos
        int hordaNumber = random.nextInt(3) + 1;
        String enemyName = "Enemy";

        System.out.println();
        System.out.println("Llega una horda de " + hordaNumber + " enemigos");
        System.out.println();
        System.out.println();



        Hero[] enemigos = new Hero[hordaNumber];
        int maxHealthEnemy = 300;
        int maxDefense = 150;
        int maxAttack = 150;


        for (int i = 0; i < hordaNumber; i++) {
            Hero enemy = new Hero(enemyName + " " + i);
            enemy.setHealth(maxHealthEnemy / hordaNumber);
            enemy.setMaxHealth(maxHealthEnemy / hordaNumber);
            enemy.setDefense(maxDefense / hordaNumber);
            enemy.setAttack(maxAttack / hordaNumber);
            enemy.setExperience(0);

            enemigos[i] = enemy;
            System.out.println(enemy);

        }





        while (heroe1.getHealth() > 0) {






        }








    }
}
