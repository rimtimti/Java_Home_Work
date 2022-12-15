package OOP_Seminar67_Notes;

public class ViewNote {
    private CommandsRun commandsRun;
    private NoteGenerator noteGenerator;

    public ViewNote(CommandsRun commandsRun, NoteGenerator noteGenerator) {
        this.commandsRun = commandsRun;
        this.noteGenerator = noteGenerator;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = noteGenerator.promptStr(
                    "\nПеред Вами программа для заметок с функциями:\n READ - прочитать заметку по Id,\n CREATE - создать новую заметку,\n UPDATE - обновить заметку,\n LIST - прочитать все заметки,\n DELETE - удалить заметку,\n EXIT - выход\n\nВведите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неправильная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        commandsRun.create();
                        break;
                    case READ:
                        commandsRun.read();
                        break;
                    case LIST:
                        commandsRun.list();
                        break;
                    case UPDATE:
                        commandsRun.update();
                        break;
                    case DELETE:
                        commandsRun.delete();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}