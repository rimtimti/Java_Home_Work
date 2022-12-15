package OOP_Seminar67_Notes;

import java.util.Date;

public class Note {
    private int id;
    private String data;
    private String title;
    private String text;

    public Note(int id, String data, String title, String text) {
        this(data, title, text);
        this.id = id;
    }

    public Note(String data, String title, String text) {
        this.data = data;
        this.title = title;
        this.text = text;
    }

    public Note(String title, String text) {
        this.data = new Date().toString();
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nДата: %s\nНазвание: %s\nОписание: %s", getId(), getData().toString(), getTitle(), getText());
    }
}