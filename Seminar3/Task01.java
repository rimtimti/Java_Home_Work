package Seminar3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Реализовать алгоритм сортировки слиянием

public class Task01 {
    public static void mergeSort(Integer[] arr) {
        if (arr.length < 2) return;

        Integer[] left = new Integer[arr.length / 2];
        Integer[] right = new Integer[arr.length - arr.length / 2];

        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, left.length, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    public static void merge(Integer[] array, Integer[] left, Integer[] right) {
        Integer k = 0, i = 0, j = 0;

        while (i < left.length && j < right.length) 
            if (left[i] <= right[j]) array[k++] = left[i++];
            else array[k++] = right[j++];
        while (i < left.length) 
            array[k++] = left[i++];
        while (j < right.length) 
            array[k++] = right[j++];
    }
    public static Integer[] randomArrayInt(Integer size, Integer min_number, Integer max_number) {
        Integer[] list = new Integer[size];
        Random haos = new Random();
        for (int i = 0; i < size; i++) {
            list [i] = haos.nextInt(min_number, max_number + 1);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.printf("Программа генерирует случайный массив целых чисел по параметрам пользователя.\nЗатем сортирует массив методом слияния.\n");
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите размер необходимого массива (целое положительное число): ");
        Integer size = input.nextInt();
        System.out.printf("Введите минимально возможное число в массиве(целое число): ");
        Integer min = input.nextInt();
        System.out.printf("Введите максимально возможное число в массиве(целое число): ");
        Integer max = input.nextInt();
        input.close();

        long time = System.nanoTime(); 

        Integer[] array = randomArrayInt(size, min, max);
        System.out.printf("Исходный массив:\n");
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.printf("Отсортированный массив:\n");
        System.out.println(Arrays.toString(array));

        time = System.nanoTime() - time;  
        System.out.printf("Выполнено за = %,.3f ms\n", time/1_000_000.0);
    }
}
