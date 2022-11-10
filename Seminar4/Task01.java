package Seminar4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class Task01 {
    public static LinkedList<Integer> randomArrayInt() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите размер необходимого массива (целое положительное число): ");
        Integer size = input.nextInt();
        System.out.printf("Введите минимально возможное число в массиве(целое число): ");
        Integer min = input.nextInt();
        System.out.printf("Введите максимально возможное число в массиве(целое число): ");
        Integer max = input.nextInt();
        input.close();
        LinkedList<Integer> list = new LinkedList<>();
        Random haos = new Random();
        for (int i = 0; i < size; i++) {
            list.add(haos.nextInt(min, max + 1));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.printf("Программа генерирует случайный массив целых чисел по параметрам пользователя.\nЗатем делает разворот массива в обратном порядке.\n");
        LinkedList<Integer> list_number = randomArrayInt();
        System.out.println(list_number);
        LinkedList<Integer> reverse = new LinkedList<>();
        for (int i = 0; i < list_number.size(); i++) {
            reverse.add(0, list_number.get(i));
        }
        System.out.print(reverse);
    }
}
