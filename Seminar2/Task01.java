package Seminar2;

// import java.util.logging.*;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task01 {
    public static void fileWriter (String inputString) {
        try {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file_Seminar2_Task01.txt");
        FileWriter x = new FileWriter(pathFile, true);
        x.append(inputString+"\n");
        x.flush();
        x.close();
        } catch (IOException ex) {
        System.out.println(ex.getMessage());
        }}

    public static void main(String[] args) {

        System.out.flush();
        // Logger logger = Logger.getLogger(Task01.class.getName());   //лог в терминал
        
        Integer[] array = { 3, 15, 45, 7, 2, 22, 44, 150, 1 };
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            String stringlogger = Arrays.toString(array);
            // logger.log(Level.INFO, stringlogger);                   //лог в терминал
            fileWriter(stringlogger);                               //лог в файл
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
 
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }     
            }
        }
        System.out.println(Arrays.toString(array));
    }
}