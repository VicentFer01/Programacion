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

        System.out.println("LVL:");
        int inputLVL = scan.nextInt();
        heroe1.setLvl(inputLVL);

        System.out.println("Healthl:");
        int inputHealth = scan.nextInt();
        heroe1.setHealth(inputHealth);

        System.out.println("MaxHealth:");
        int inputMaxHealth = scan.nextInt();
        heroe1.setMaxHealth(inputMaxHealth);

        System.out.println("Experience:");
        int inputExperience = scan.nextInt();
        heroe1.setExperience(inputExperience);

        System.out.println("Attack:");
        int inputAttack = scan.nextInt();
        heroe1.setAttack(inputAttack);

        System.out.println("Defense:");
        int inputDefense = scan.nextInt();
        heroe1.setDefense(inputDefense);


        System.out.println(heroe1);


        // Generar enemigos
        int hordaNumber = random.nextInt(3) + 1;
        String enemyName = "Enemy";

        Hero[] enemigos = new Hero[hordaNumber];


        for (int i = 0; i < hordaNumber; i++) {
            Hero enemy = new Hero(enemyName + " " + i);
            enemy.setHealth(50);
            enemy.setMaxHealth(50);
            enemy.setDefense(50);
            enemy.setAttack(100);
            enemy.setExperience(0);

            enemigos[i] = enemy;

        }
        System.out.println(Arrays.toString(enemigos));



        System.out.println("Llega una horda de " + hordaNumber + " enemigos");


        while (heroe1.getHealth() > 0) {





        }








    }
}
