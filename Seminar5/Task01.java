package Seminar5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class Task01 {
    public static void fileWriter(HashMap<String, String> list_number) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file_Seminar5_Task01.txt");
            FileWriter x = new FileWriter(pathFile, false);
            String inputString = new String();
            for (var i: list_number.entrySet()) {
                inputString = i.getKey() +"   =   "+ i.getValue();
                x.append(inputString + "\n");
            }
            x.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static HashMap<String, String> fileReader(String file_name, HashMap<String, String> list_number) {
        try {
            FileReader x = new FileReader(file_name);
            Scanner scan = new Scanner(x);

            while (scan.hasNextLine()) {
                String [] input = new String [2];
                input = scan.nextLine().replaceAll(" ", "").split("=");
                list_number.putIfAbsent(input[0], input[1]);
            }
            scan.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list_number;
    }

    public static HashMap<String, String> enter(HashMap<String, String> list_number) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите номер телефона: ");
        String number = input.next();
        System.out.printf("Введите фамилию: ");
        String surname = input.next();
        list_number.putIfAbsent(number, surname);
        System.out.printf("Теперь телефонная книга выглядит так:\n");
        System.out.println(list_number);
        return list_number;
    }

    public static HashMap<String, String> delete(HashMap<String, String> list_number) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите номер телефона: ");
        String number = input.next();
        list_number.remove(number);
        System.out.printf("Теперь телефонная книга выглядит так:\n");
        System.out.println(list_number);
        return list_number;
    }

    public static HashMap<String, String> search(HashMap<String, String> list_number) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите фамилию: ");
        String name = input.next();
        for (var i: list_number.entrySet()) {
            if (i.getValue().equals(name))
                System.out.printf("[%s, %s]\n", i.getKey(), i.getValue());
        }
        System.out.printf("Телефонная книга выглядит так:\n");
        System.out.println(list_number);
        return list_number;
    }

    public static void main(String[] args) {
        HashMap<String, String> list_number = new HashMap<String, String>();
        fileReader("file_Seminar5_Task01.txt", list_number);
        System.out.printf("Телефонная книга выглядит так:\n");
        System.out.println(list_number);
        System.out.printf("Программа открыла телефонную книгу из файла file_Seminar5_Task01.txt со следующими функциями:\n");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf("1. enter - создает запись в книге,\n2. delete - удаляет запись в книге по номеру телефона,\n3. search - ищет номера телефонов по фамилии,\n4. stop - выход из программы.\nВведите необходимый номер: ");
            String choice = input.next();
            if (choice.equals("1")) {
                enter(list_number);
            }
            if (choice.equals("2")) {
                delete(list_number);
            }
            if (choice.equals("3")) {
                search(list_number);
            }
            if (choice.equals("4")) {
                break;
            }
        }
        System.out.printf("Телефонная книга сохранена в file_Seminar5_Task01.txt\n");
        fileWriter(list_number);
        input.close();
        System.out.printf("До новых встреч! ))))");
    }
}

