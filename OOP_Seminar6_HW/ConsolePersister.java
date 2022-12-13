package OOP_Seminar6_HW;

public class ConsolePersister {
    private User user;

    public ConsolePersister(User user) {
        this.user = user;
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}