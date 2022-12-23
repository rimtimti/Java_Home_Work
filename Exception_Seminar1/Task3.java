package Exception_Seminar1;

// Реализуйте метод, принимающий в качестве аргументов два целочисленныхb массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = { 25, 81, 55, 666, 111 };
        int[] array2 = { 5, 3, 5, 33, 37 };
        printArray(getArrayDivArray(array1, array2));
    }

    public static int[] getArrayDivArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Деление на ноль невозможно! Ошибка на индексе " + i);
            }
            result[i] = array1[i] / array2[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
