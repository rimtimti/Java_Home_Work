package Exception_Seminar2;

public class Task2 {
    public static void main(String[] args) {
        int index = 8;
        int[] intArray = new int[index];
        int d = 0;
        if (d == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (index >= intArray.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}
