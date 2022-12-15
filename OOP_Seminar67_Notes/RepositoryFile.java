package OOP_Seminar67_Notes;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private NoteMapper mapper = new NoteMapper();

    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public int createNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = item.getId();
            if (max < id) {
                max = id;
            }
        }
        int id = max + 1;
        note.setId(id);
        notes.add(note);
        saveNotes(notes);
        return id;
    }

    private void saveNotes(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public Note updateNote(Note note) throws Exception {
        List<Note> notes = getAllNotes();
        Note foundNote = findNoteById(notes, note.getId());
        foundNote.setTitle(note.getTitle());
        foundNote.setText(note.getText());
        saveNotes(notes);
        return foundNote;
    }

    @Override
    public Note readNote(int noteId) throws Exception {
        List<Note> notes = getAllNotes();
        return findNoteById(notes, noteId);
    }

    private Note findNoteById(List<Note> notes, int noteId) throws Exception {
        for (Note note : notes) {
            if (note.getId() == noteId) {
                return note;
            }
        }
        throw new Exception("Заметка не найдена!");
    }

    @Override
    public void deleteNote(Note note) throws Exception {
        List<Note> notes = getAllNotes();
        Note findedNote = findNoteById(notes, note.getId());
        notes.remove(findedNote);
        saveNotes(notes);
    }
}