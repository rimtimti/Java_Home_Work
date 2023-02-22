package Exception_Seminar3;

public class ExeptionMoreInput extends RuntimeException  {

    public ExeptionMoreInput() {
        super("Введено больше данных чем нужно!");
    }
}