package Exception_Seminar1;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = { 100, 1513, 54545, 654 };
        int[] array2 = { 56, 4543, 6453453, 7453 };
        printArray(getArrayMinusArray(array1, array2));
    }

    public static int[] getArrayMinusArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
