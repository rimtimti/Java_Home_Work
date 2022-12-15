package OOP_Seminar6_HW;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        ConsolePersister consolePersister = new ConsolePersister(user);
        FilePersister filePersister = new FilePersister(user);
        consolePersister.report();
        filePersister.save();
    }
}