package Seminar1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


// Реализовать простой калькулятор + добавить логирование

public class Task03 {
    public static void fileWriter (String inputString) {
        try {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file_Seminar1_Task03.txt");
        FileWriter x = new FileWriter(pathFile, true);
        x.append(inputString+"\n");
        x.close();
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }}
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        Double number1 = input.nextDouble();
        System.out.printf("Введите знак действия: ");
        String sign = input.next();
        System.out.printf("Введите второе число: ");
        Double number2 = input.nextDouble();
        input.close();
        
        String result = new String();
        switch (sign) {
            case "+":
                result = String.format("%f %s %f = %f", number1, sign, number2, number1 + number2);
                break;
            case "-":
                result = String.format("%f %s %f = %f", number1, sign, number2, number1 - number2);
                break;
            case "*":
                result = String.format("%f %s %f = %f", number1, sign, number2, number1 * number2);
                break;
            case "/":
                if (number2 != 0)
                    result = String.format("%f %s %f = %f", number1, sign, number2, number1 / number2);
                else
                    result = String.format("%f %s %f = Деление на ноль невозможно!", number1, sign, number2);
                break;
        }
        System.out.println(result);
        fileWriter(result);
    }
}
