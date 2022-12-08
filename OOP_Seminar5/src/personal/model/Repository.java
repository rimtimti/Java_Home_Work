package OOP_Seminar5.src.personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();

    String createUser(User user);

    User updateUser(User user) throws Exception;

    User readUser(String userId) throws Exception;

    void deleteUser(User user) throws Exception;
}