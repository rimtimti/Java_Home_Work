package OOP_Seminar6_HW;

public abstract class Persister {
    public User user;

    public Persister(User user) {
        this.user = user;
    }

    @Override
    public String toString(){
        return user.getName();
    }
}