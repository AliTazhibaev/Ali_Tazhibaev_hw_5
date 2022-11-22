public class Hero {

    private int heroHealth;             //здоровье
    private int heroDamage;             //урон
    private int heroSuperPowers;     // суперспособности


    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroSuperPowers() {
        return heroSuperPowers;
    }

    public Hero(int heroHealth, int heroDamage, int heroSuperPowers) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperPowers = heroSuperPowers;

    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }


}
