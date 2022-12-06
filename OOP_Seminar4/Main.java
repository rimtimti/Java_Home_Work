package OOP_Seminar4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Герой1", 220, new Staff(), new HeavyShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Коля", 100, new Bow(), new LightShield(), 10));
        red.add(new Archer("Вася", 100, new Bow(), 10));
        red.add(new Archer("Леша", 150, new LongBow(), new LightShield(), 10));
        Hero hero2 = new Hero("Герой2", 150, new Bow(), new HeavyShield());
        Team<Mage> white = new Team<>(hero2);
        white.add(new Mage("Миша", 180, new Staff(), new AverageShield(), 15, 100));
        white.add(new Mage("Федя", 140, new Staff(), new AverageShield(), 15, 100));
        white.add(new Mage("Серега", 80, new Staff(), 15, 100));
        Hero hero3 = new Hero("Герой3", 200, new Bow());
        Team<Warrior> multi = new Team<>(hero3);
        multi.add(new Mage("Саша", 80, new Staff(), new AverageShield(), 15, 100));
        multi.add(new Archer("Андрей", 150, new Bow(), new LightShield(), 10));
        multi.add(new Archer("Игорь", 100, new Bow(), new LightShield(), 10));
        System.out.println(red);
        System.out.println(white);
        System.out.println(multi);
        System.out.println(red.getTeamHealthPoint());
        System.out.println(white.getTeamHealthPoint());
        System.out.println(multi.getTeamHealthPoint());
    }
}