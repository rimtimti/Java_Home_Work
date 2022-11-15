package Seminar5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Пусть дан список сотрудников: file_Seminar5_Task02.txt
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности имени.

public class Task02 {
    public static ArrayList<String> fileReader(String file_name, ArrayList<String> employees) {
        try {
            FileReader x = new FileReader(file_name);
            Scanner scan = new Scanner(x);

            while (scan.hasNextLine()) {
                String [] input = new String [0];
                input = scan.nextLine().split(" ");
                employees.add(input[0]);
            }
            scan.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return employees;
    }

    public static void searchName(ArrayList<String> employees) {
        HashMap<String, Integer> res = new HashMap<>();
        int count = 0;
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size(); j++) {
                if (employees.get(i).equals(employees.get(j))) {
                    count++;
                }
            }
            res.putIfAbsent(employees.get(i), count);
            count = 0;
        }
        res.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<String>();
        fileReader("file_Seminar5_Task02.txt", employees);
        System.out.printf("Программа открыла список сотрудников из файла file_Seminar5_Task02.txt:\n");
        System.out.printf("Частота имен сотрудников в порядке убывания:\n");
        searchName(employees);
    }
}


