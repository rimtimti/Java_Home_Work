package OOP_Seminar3;

public class User {
    private String firstName;
    private String lastName;
    private Integer age;
    private User user;


    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User getUser(){
        return user;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, age);
    }

}