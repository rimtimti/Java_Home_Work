package Seminar2;

// Дана json строка (сохранить в файл и читать из файла) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Task02 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("file_Seminar2_Task02.json");
        JSONParser jsonParser = new JSONParser();
        JSONArray students = (JSONArray) jsonParser.parse(reader);

        for (Object obj : students) {
            JSONObject person = (JSONObject) obj;

            StringBuilder result = new StringBuilder();

            result.append("Студент ").append(person.get("фамилия")).append(" получил ")
                    .append((String) person.get("оценка")).append(" по предмету ")
                    .append((String) person.get("предмет")).append(".");
            System.out.println(result.toString());

        }
    }
}
