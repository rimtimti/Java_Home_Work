package OOP_Seminar5.src.personal;

import OOP_Seminar5.src.personal.controllers.UserController;
import OOP_Seminar5.src.personal.model.FileOperation;
import OOP_Seminar5.src.personal.model.FileOperationImpl;

import OOP_Seminar5.src.personal.model.Repository;
import OOP_Seminar5.src.personal.model.RepositoryFile;
import OOP_Seminar5.src.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("OOP_Seminar5/users.txt");
        FileOperation fileOperationNew = new FileOperationImpl("OOP_Seminar5/usersNew.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Repository repositoryNew = new RepositoryFile(fileOperationNew);
        UserController controller = new UserController(repository);
        UserController controllerNew = new UserController(repositoryNew);
        ViewUser view = new ViewUser(controllerNew);
        view.run();
    }
}