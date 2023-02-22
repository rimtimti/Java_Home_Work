package Exception_Seminar3;

public class ExceptionIncorrectName extends RuntimeException {
    
    public ExceptionIncorrectName() {
        super("Некорректно введены поля фамилии, имени или отчества!");
    }
}
