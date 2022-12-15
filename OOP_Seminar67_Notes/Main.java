package OOP_Seminar67_Notes;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("C:\\Users\\rimtimti\\OneDrive\\Desktop\\JAVA\\JAVA_Home_Work\\OOP_Seminar67_Notes\\Заметки.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NoteGenerator noteGenerator = new NoteGenerator();
        NoteController controller = new NoteController(repository);
        CommandsRun commandsRun = new CommandsRun(controller, noteGenerator);
        ViewNote view = new ViewNote(commandsRun, noteGenerator);
        view.run();
    }
}