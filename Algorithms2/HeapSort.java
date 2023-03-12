package Algorithms2;

// Реализация пирамидальной сортировки на Java

public class HeapSort {

    public static void main(String args[]) {
        ArrayUtulites au = new ArrayUtulites();
        int[] arr = au.prepareArray(15);
        System.out.println("Создан рандомный массив");
        au.printArray(arr);
        au.sort(arr);
        System.out.println("Массив отсортирован");
        au.printArray(arr);
    }
}