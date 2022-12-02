package OOP_Seminar3;

public class Main {
    public static void main(String[] args) {
        CustomList<User> cl = new CustomList<>();
        cl.add(new User("Сергей", "Петров", 23));
        cl.add(new User("Иван", "Иванов", 78));
        cl.add(new User("Игорь", "Сидоров", 23));
        for (final Node node : cl) {
            System.out.println(node.getData());
        }
    }
}