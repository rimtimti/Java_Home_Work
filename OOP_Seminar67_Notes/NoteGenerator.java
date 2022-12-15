package OOP_Seminar67_Notes;

import java.util.Date;
import java.util.Scanner;

public class NoteGenerator {
    protected String promptStr(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }

    protected int promptInt(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    public Note setNote(boolean forUpdate) {
        int id = 0;
        if (forUpdate) {
            id = promptInt("ID: ");
        }
        String data = new Date().toString();
        String title = promptStr("Название: ");
        String text = promptStr("Описание: ");
        if (forUpdate) {
            return new Note(id, data, title, text);
        }
        return new Note(data, title, text);
    }
    
}