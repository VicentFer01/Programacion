package Objetos;

public class Hero {
    private String name;
    private int lvl;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    public Hero(String name, int lvl, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.lvl = lvl;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
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

    public void levelUP(int lvl) {
        health = health + 5;
        lvl = lvl + 1;

    }

    public int drinkPotion(int health) {
        System.out.println("Has bebido una pocion que ha restaurado 10 vida");

        return health + 10;
    }

    public void rest(int health) {
        System.out.println("Has descansado y recuperado 50 de vida");
        health = health + 50;
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
        this.health = health;
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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
