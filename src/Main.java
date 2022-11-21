public class Main {
    public static void main(String[] args) {
        Boss dragon = new Boss();
        dragon.setBossHealth(800);
        dragon.setBossDamage(80);
        dragon.setBossShield(50);
        System.out.println("Boss health: "+ dragon.getBossHealth()+ " Boss damage: "+ dragon.getBossDamage()+ " Boss shield: "+ dragon.getBossShield());
    }

}