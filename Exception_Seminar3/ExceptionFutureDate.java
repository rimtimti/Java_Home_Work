package Exception_Seminar3;

public class ExceptionFutureDate extends RuntimeException{

    public ExceptionFutureDate() {
        super("Введена дата позднее текущей! Вы из будущего?");
    } 
}
