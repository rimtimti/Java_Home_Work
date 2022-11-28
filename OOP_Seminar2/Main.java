package OOP_Seminar2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Звуки зоопарка:");
        zoo.talk();
        System.out.println("\nБегают:");
        zoo.run();
        System.out.println("\nЛетают:");
        zoo.fly();
        System.out.println("\nПлавают:");
        zoo.swim();
    }
}
