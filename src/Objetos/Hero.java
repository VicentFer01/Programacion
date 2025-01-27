package Objetos;

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
        if (damage < 0) damage = 0;
        enemy.setHealth(enemy.getHealth() - damage);
        return damage;
    }

    public int enemyAttack(Hero hero) {
        int damage = this.attack - hero.getDefense();
        if (damage < 0) damage = 0;
        hero.setHealth(hero.getHealth() - damage);
        return damage;
    }

    public void levelUP() {
        this.lvl++;
        this.attack += 5;
        this.defense += 3;
        this.maxHealth += 20;
        this.health = this.maxHealth;
        System.out.println(this.name + " ha subido al nivel " + this.lvl + "!");
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
