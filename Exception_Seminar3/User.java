package Exception_Seminar3;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String telephone;
    private String gender;

    public User(String surname, String name, String patronymic, String birthday, String telephone, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.telephone = telephone;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getGender() {
        return gender;
    }

}
