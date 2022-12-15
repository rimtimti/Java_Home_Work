package OOP_Seminar67_Notes;

import java.util.List;

public class NoteController {
    private final Repository repository;

    public NoteController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        validateNote(note);
        repository.createNote(note);
    }

    public Note readNote(int noteId) throws Exception {
        return repository.readNote(noteId);
    }

    public List<Note> readNotesList() {
        return repository.getAllNotes();
    }

    public Note updateNote(Note note) throws Exception {
        validateNote(note);
        return repository.updateNote(note);
    }

    public void deleteNote(Note note) throws Exception {
        repository.deleteNote(note);
    }

    private void validateNote(Note note) throws Exception {
        if (note.getTitle().isEmpty()) {
            throw new Exception("Отсутствует название");
        }
        if (note.getText().isEmpty()) {
            throw new Exception("Отсутствует описание");
        }
    }
}