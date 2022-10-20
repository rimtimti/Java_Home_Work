package Seminar1;

import java.util.Scanner;

// Реализовать простой калькулятор

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        Double number1 = input.nextDouble();
        System.out.printf("Введите знак действия: ");
        String sign = input.next();
        System.out.printf("Введите второе число: ");
        Double number2 = input.nextDouble();
        input.close();

        switch (sign) {
            case "+":
                System.out.printf("%f %s %f = %f\n", number1, sign, number2, number1 + number2);
                break;
            case "-":
                System.out.printf("%f %s %f = %f\n", number1, sign, number2, number1 - number2);
                break;
            case "*":
                System.out.printf("%f %s %f = %f\n", number1, sign, number2, number1 * number2);
                break;
            case "/":
                if (number2 != 0)
                    System.out.printf("%f %s %f = %f\n", number1, sign, number2, number1 / number2);
                else
                    System.out.printf("Деление на ноль невозможно!\n");
                break;
        }
    }
}
