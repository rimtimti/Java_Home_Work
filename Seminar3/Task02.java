package Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task02 {
    public static ArrayList<Integer> randomArrayInt(Integer size, Integer min_number, Integer max_number) {
        ArrayList<Integer> list = new ArrayList<>();
        Random haos = new Random();
        for (int i = 0; i < size; i++) {
            list.add(haos.nextInt(min_number, max_number + 1));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.printf("Программа генерирует случайный массив целых чисел по параметрам пользователя.\nЗатем удаляет из него чётные числа.\n");
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите размер необходимого массива (целое положительное число): ");
        Integer size = input.nextInt();
        System.out.printf("Введите минимально возможное число в массиве(целое число): ");
        Integer min = input.nextInt();
        System.out.printf("Введите максимально возможное число в массиве(целое число): ");
        Integer max = input.nextInt();
        input.close();

        ArrayList<Integer> list_number = randomArrayInt(size, min, max);
        System.out.println(list_number);

        for (int i = list_number.size() - 1; i >= 0; i--) {
            if (list_number.get(i) % 2 == 0) {
                list_number.remove(i);
            }
        }
        System.out.printf("Удалены все чётные числа:\n");
        System.out.println(list_number);
    }
}
