package OOP_Seminar6_HW;

public class FilePersister extends Persister {

    public FilePersister(User user) {
        super(user);
    }

    public void save() {
        System.out.println("Save user to file: " + user.getName());
    }
}
