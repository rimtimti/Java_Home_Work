package Exception_Seminar3;

public class ExceptionMoreInput extends RuntimeException  {

    public ExceptionMoreInput() {
        super("Введено больше данных чем нужно!");
    }
}