package Exception_Seminar3;

public class ExceptionLessInput extends RuntimeException {

    public ExceptionLessInput() {
        super("Введено меньше данных чем нужно!");
    }
}