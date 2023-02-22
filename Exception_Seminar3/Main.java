package Exception_Seminar3;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        UserInterface ui = new UserInterface(controller);
        ui.run();
    }
}
