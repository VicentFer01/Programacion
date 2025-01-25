package Objetos;

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



        // Generar enemigos
        int hordaNumber = random.nextInt(3);
        String enemyName = "Enemy";


        for (int i = 0; i < hordaNumber; i++) {
            enemyName = "Enemy " + 1;
            Hero enemy = new Hero(
                    enemyName,
                    heroe1.getLvl() / 2,
                    heroe1.getHealth() / 2,
                    heroe1.getMaxHealth() / 2,
                    heroe1.getExperience() / 2,
                    heroe1.getAttack() / 2,
                    heroe1.getDefense() / 2
            );
            System.out.println(enemy);
        }


        while (heroe1.getHealth() > 0) {
            System.out.println("Llega una horda de " + hordaNumber + " enemigos");

            int danyo = attack(inputAttack)


        }








    }
}
