package OOP_Seminar67_Notes;

import java.util.List;

public class CommandsRun {
    public NoteController noteController;
    public NoteGenerator noteGenerator;

    public CommandsRun(NoteController noteController, NoteGenerator noteGenerator) {
        this.noteController = noteController;
        this.noteGenerator = noteGenerator;
    }
    
    public Note create() throws Exception{
        Note note = noteGenerator.setNote(false);
        noteController.saveNote(note);
        return note;
    }
    public Note read() throws Exception{
        int id = noteGenerator.promptInt("Введите Id записки: ");
        Note readedNote = noteController.readNote(id);
        System.out.println(readedNote);
        return readedNote;
    }

    public List<Note> list() throws Exception{
        List<Note> noteList = noteController.readNotesList();
        for (Note notes : noteList) {
            System.out.println(notes);
            System.out.println();
        }
        return noteList;
    }

    public Note update() throws Exception{
        Note updateNote = noteGenerator.setNote(true);
        noteController.updateNote(updateNote);
        return updateNote;
    }
    
    public Note delete() throws Exception{
        int noteId = noteGenerator.promptInt("Введите Id записки: ");
        Note needTodeleteNote = noteController.readNote(noteId);
        noteController.deleteNote(needTodeleteNote);
        return needTodeleteNote;
    }
}
