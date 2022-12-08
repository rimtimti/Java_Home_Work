package OOP_Seminar5.src.personal.model;

public class UserMapperNew {
    public String map(User user) {
        return String.format("%s\t~\t%s\t~\t%s\t~\t%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split("\t~\t");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}