package OOP_Seminar67_Notes;

public class NoteMapper {
    public String map(Note Note) {
        return String.format("%d\t%s\t%s\t%s", Note.getId(), Note.getData(), Note.getTitle(), Note.getText());
    }

    public Note map(String line) {
        String[] lines = line.split("\t");
        return new Note((Integer.parseInt(lines[0])), lines[1], lines[2], lines[3]);
    }
}