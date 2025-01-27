package Objetos;

import java.io.PrintStream;
import java.util.Arrays;
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

        Hero[] enemigos = null;
        while (heroe1.getHealth() > 0) { // Mientras que el heroe tenga vida el juego sigue

            int hordaNumber = random.nextInt(3) + 1; // Generar horda de 1 a 3 enemigos

            System.out.println();
            System.out.println("Llega una horda de " + hordaNumber + " enemigos:");
            System.out.println();

            enemigos = new Hero[hordaNumber];


            for (int i = 0; i < hordaNumber; i++) {  // Crear las instancias de los enemigos y establecer sus atributos
                Hero enemy = new Hero(enemyName + " " + i);
                enemy.setHealth(heroe1.getMaxHealth() / hordaNumber);
                enemy.setMaxHealth(heroe1.getMaxHealth() / hordaNumber);
                enemy.setAttack(heroe1.getAttack() / hordaNumber);
                enemy.setDefense(heroe1.getMaxDefense() / hordaNumber);
                enemigos[i] = enemy; // Cada indice de la array es un objeto enemigo
                System.out.println(enemy); // Printear detalles de cada enemigo
            }

            for (int i = 0; i < enemigos.length; i++) {
                Hero enemy = enemigos[i]; // Posicionar los objetos enemy en la array

                if (enemy.getHealth() > 0) { // El heroe ataca si el primer enemigo tiene vida
                    System.out.println();
                    System.out.println("Escribe 1 para atacar a " + enemy.getName());
                    int seleccion = scan.nextInt();
                    switch (seleccion) {  // Pongo la seleccion para que sea interactivo y no se ejecute todo inmediatamente
                        case 1:
                            int heroDamage = heroe1.heroAttack(enemy); // Funcion daño del heroe al enemigo
                            System.out.println(heroe1.getName() + " ataca a " + enemy.getName() + " causando " + heroDamage + " de daño.");
                            System.out.println(enemy.getName() + " tiene " + enemy.getHealth() + " puntos de vida");
                            System.out.println();

                    }

                    if (enemy.getHealth() <= 0) { // Si el enemigo no tiene vida sera derrotado
                        System.out.println(enemy.getName() + " ha sido derrotado.");
                    } else {
                        int enemyDamage = enemy.enemyAttack(heroe1); // Si el enemigo tiene vida nos atacará
                        System.out.println(enemy.getName() + " contraataca causando " + enemyDamage + " de daño."); // Funcion atacar enemigo a heroe
                        System.out.println(heroe1.getName() + " tiene ahora " + heroe1.getHealth() + " puntos de vida");

                        if (heroe1.getHealth() <= 0) { // Si el heroe no tiene vida muere
                            System.out.println(heroe1.getName() + " ha sido derrotado. Fin del juego.");
                        }
                    }
                }
            }
        }

                    boolean hordaDerrotada = true;  // Esto no lo he podido hacer por mi cuenta
                    for (Hero enemy : enemigos) {
                        if (enemy.getHealth() > 0) {
                            hordaDerrotada = false;

                            break;
                        }
                    }

        if (heroe1.getHealth() > 0) {
            System.out.println("¡Has derrotado a todos los enemigos, llega una nueva horda");
            heroe1.setAttack(heroe1.getAttack() + 10);
            heroe1.setDefense(heroe1.getDefense() + 10);
            heroe1.setLvl(heroe1.getLvl() + 1);
            heroe1.setMaxHealth(heroe1.getMaxHealth() + 10);


        } else {
            System.out.println(heroe1.getName() + " ha caído en batalla.");
        }
    }
}
