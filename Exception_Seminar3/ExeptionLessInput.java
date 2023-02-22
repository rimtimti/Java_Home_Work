package Exception_Seminar3;

public class ExeptionLessInput extends RuntimeException {

    public ExeptionLessInput() {
        super("Введено меньше данных чем нужно!");
    }
}