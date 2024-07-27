package Problema4;

public class App {
    CommandHistory commandHistory;

    public App() {
        this.commandHistory = new CommandHistory();
    }

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoCommand(){
        Command command = commandHistory.pop();
        if (command != null)
            command.undo();
    }
}
