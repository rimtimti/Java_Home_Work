package Algorithms2;

import java.util.Random;

public class ArrayUtulites {

    private static final Random random = new Random();

    /**
     * Подготовить массив случайных чисел
     * 
     * @return
     */
    static int[] prepareArray() {
        int[] arr = new int[random.nextInt(16) + 5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) - 50;
        }
        return arr;
    }

    /**
     * Подготовить массив случайных чисел
     * 
     * @param length кол-во элементов
     * @return
     */
    public int[] prepareArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) - 50;
        }
        return arr;
    }

    /**
     * Распечатать массив на экран
     * 
     * @param arr
     */
    public void printArray(int[] arr) {
        for (int e : arr) {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }



    public void sort(int arr[]) {
        // Построение кучи (перегруппируем массив)
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        // Один за другим извлекаем элементы из кучи
        for (int i = arr.length - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец
            arr[0] += arr[i];
            arr[i] = arr[0] - arr[i];
            arr[0] = arr[0] - arr[i];

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i,
    // что является индексом в arr[]. n - размер кучи
    public void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        largest = ifElementMoreRoot(arr, n, largest, l);
        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        largest = ifElementMoreRoot(arr, n, largest, r);
        // // Если самый большой элемент не корень
        if (largest != i) {
            arr[i] = arr[i] + arr[largest];
            arr[largest] = arr[i] - arr[largest];
            arr[i] = arr[i] - arr[largest];

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }
    public int ifElementMoreRoot(int arr[], int n, int largest, int lr){
        if (lr < n && arr[lr] > arr[largest])
            largest = lr;
        return largest;
    }
}