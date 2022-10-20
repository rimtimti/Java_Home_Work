package Seminar1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        Integer number = input.nextInt();
        input.close();
        Integer sum = 0, factorial = 1;
        for (Integer i = 1; i <= number; i++) {
            sum += i;
            factorial *= i;
        }
        System.out.printf("Сумма чисел от 1 до N = %d\n", sum);
        System.out.printf("Факториал числа N = %d", factorial);
    }
}