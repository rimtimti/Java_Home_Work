package Seminar1;

import java.util.Scanner;
import java.util.ArrayList;

// Вывести все простые числа от 2 до N (1000)

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        Integer number = input.nextInt();
        input.close();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        for (Integer i = 3; i <= number; i++) {
            for (Integer j = 0; j < array.size(); j++) {
                if (i % array.get(j) == 0) break;
                if (j == array.size()-1) array.add(i);
            }
        }
        System.out.println(array);
    }
}