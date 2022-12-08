package OOP_Seminar5.src.personal.controllers;

import OOP_Seminar5.src.personal.model.Repository;
import OOP_Seminar5.src.personal.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) throws Exception {
        validateUser(user);
        repository.createUser(user);
    }

    public User readUser(String userId) throws Exception {
        return repository.readUser(userId);

    }

    public List<User> readUserList() {
        return repository.getAllUsers();
    }

    public User updateUser(User user) throws Exception {
        validateUser(user);
        return repository.updateUser(user);

    }

    public void deleteUser(User user) throws Exception {
        repository.deleteUser(user);
    }

    private void validateUser(User user) throws Exception {
        if (user.getFirstName().isEmpty()) {
            throw new Exception("Отсутствует имя");
        }
        if (user.getLastName().isEmpty()) {
            throw new Exception("Отсутствует фамилия");
        }
        if (user.getPhone().isEmpty()) {
            throw new Exception("Отсутствует телефон");
        }
    }
}