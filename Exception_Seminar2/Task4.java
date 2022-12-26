package Exception_Seminar2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
    public static void main(String[] args) {
        getString();
    }

    public static void getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
    }

}
