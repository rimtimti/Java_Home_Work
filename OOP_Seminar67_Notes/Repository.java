package OOP_Seminar67_Notes;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();

    int createNote(Note note);

    Note updateNote(Note note) throws Exception;

    Note readNote(int noteId) throws Exception;

    void deleteNote(Note note) throws Exception;
}