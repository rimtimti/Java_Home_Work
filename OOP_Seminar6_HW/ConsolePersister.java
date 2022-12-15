package OOP_Seminar6_HW;

public class ConsolePersister extends Persister{
    
    public ConsolePersister(User user) {
        super(user);
    }

    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}