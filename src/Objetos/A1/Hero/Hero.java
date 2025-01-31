package Objetos.A1.Hero;

import java.util.Random;

public class Hero {
    private String name;
    private int lvl;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    private int maxDefense;

    public Hero(String name, int lvl, int health, int maxHealth, int experience, int attack, int defense, int maxDefense) {
        this.name = name;
        this.lvl = lvl;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
        this.maxDefense = maxDefense;
    }

    public Hero(String name) {
        this(name, 1, 100, 100, 0, 10, 5, 10);
    }

    public int heroAttack(Hero enemy) {
        int damage = this.attack - enemy.getDefense();
        if (damage < 0) damage = 0; // Asegurar que el daño no sea negativo
        enemy.setHealth(enemy.getHealth() - damage);
        return damage;
    }



    public int enemyAttack(Hero hero) {
        int damage = this.attack - hero.getDefense();
        if (damage < 0) { damage = 0; }
        hero.setHealth(hero.getHealth() - damage);
        return damage;
    }

    public void heroeDescansa() {
        Random rand = new Random();
        double descansarR = rand.nextInt(101);
        double probDescansar = 0.1;

        if (descansarR < probDescansar) {
            setHealth(getHealth() + 80);
            System.out.println("Has descansado y recuperado vida");
        }

    }

    public void encontrarPocion() {
        Random rand = new Random();
        double encontrarPocionR = rand.nextInt(101);
        double probEncontrarPocion = 10;

        if (encontrarPocionR < probEncontrarPocion) {
            setHealth(getHealth() + 50);
            System.out.println("Has encontrado una pocion y te has curado");
        }


    }

    public void levelUP() {
        this.lvl++;
        this.attack += 5;
        this.defense += 3;
        this.maxHealth += 20;
        this.health += 10 ;
        System.out.println("\n" +
                ".____                      .__     ____ _____________._.\n" +
                "|    |    _______  __ ____ |  |   |    |   \\______   \\ |\n" +
                "|    |  _/ __ \\  \\/ // __ \\|  |   |    |   /|     ___/ |\n" +
                "|    |__\\  ___/\\   /\\  ___/|  |__ |    |  / |    |    \\|\n" +
                "|_______ \\___  >\\_/  \\___  >____/ |______/  |____|    __\n" +
                "        \\/   \\/          \\/                           \\/\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health); // Asegura que la salud no sea negativa
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMaxDefense() {
        return maxDefense;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", health=" + health +
                ", maxHealth=" + maxHealth +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }


}


