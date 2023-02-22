package Exception_Seminar3;

public class ExceptionIncorrectGender extends RuntimeException {

    public ExceptionIncorrectGender() {
        super("Введен некорректный формат пола!");
    }
}