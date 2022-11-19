package Seminar6;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task01 {
    public static HashSet<Notebook> fileReader(String file_name, HashSet<Notebook> notebooks) {
        try {
            FileReader x = new FileReader(file_name);
            Scanner scan = new Scanner(x);

            while (scan.hasNextLine()) {
                String [] input = new String [7];
                input = scan.nextLine().replaceAll(" ", "").split("=");
                Notebook notebook = new Notebook(input[0],input[1],input[2],input[3],input[4],input[5],input[6]);
                notebooks.add(notebook);
            }
            scan.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return notebooks;
    }

    public static void resultFind(LinkedHashMap<String, Notebook> result) {
        for (var notebook : result.entrySet()) {
            System.out.printf("\n%s\n%s\n", notebook.getKey(), notebook.getValue().toString());
        }
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Notebook> result = new LinkedHashMap<>();
        HashSet<Notebook> notebooks = new HashSet<>();
        fileReader("seminar6_notebooks.txt", notebooks);
        System.out.println("Программа загрузила список ноутбуков из файла seminar6_notebooks.txt.");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nВы можете выполнить поиск по параметрам: \n1 - по процессору\n2 - по оперативной памяти\n3 - по жесткому диску\n4 - по видеокарте\n5 - по материнской плате\n6 - по цвету\n7 - по диагонали экрана\n8 - выход из программы\nВведите необходимый номер: ");
            Integer choice = scanner.nextInt();
            if (choice.equals(1)) {
                System.out.print("Введите производителя CPU: ");
                String input = scanner.next();
                Notebook.findCPU(notebooks, input, result);
            }
            if (choice.equals(2)) {
                System.out.print("Введите объем RAM: ");
                String input = scanner.next();
                Notebook.findRAM(notebooks, input, result);
            }
            if (choice.equals(3)) {
                System.out.print("Введите объем HDD: ");
                String input = scanner.next();
                Notebook.findHDD(notebooks, input, result);
            }
            if (choice.equals(4)) {
                System.out.print("Введите производителя видеокарты: ");
                String input = scanner.next();
                Notebook.findVideo(notebooks, input, result);
            }
            if (choice.equals(5)) {
                System.out.print("Введите производителя материнской платы: ");
                String input = scanner.next();
                Notebook.findMother(notebooks, input, result);
            }
            if (choice.equals(6)) {
                System.out.print("Введите цвет: ");
                String input = scanner.next();
                Notebook.findColor(notebooks, input, result);
            }
            if (choice.equals(7)) {
                System.out.print("Введите диагональ экрана: ");
                String input = scanner.next();
                Notebook.findScreen(notebooks, input, result);
            }
            if (choice.equals(8)) {
                System.out.print("До новых встреч! ))))");
                scanner.close();
                break;
            }
            resultFind(result);
            result.clear();;
        }
    }
}
