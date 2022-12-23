package Exception_Seminar1;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {
    public static void main(String[] args) {
        div(3,0);
        createArray(-1);
        stringToInt("465465444444444654666666666666666666666666666666666666666666666666666666666666666666666666666");
    }

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    public static int div(int x, int y) {
        return x / y;
    }
}
