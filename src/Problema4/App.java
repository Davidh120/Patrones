package Problema4;

import java.util.Stack;

public class App {
    CommandHistory commandHistory;

    public App() {
        this.commandHistory = new CommandHistory();
    }

    public void executeCommand(ICommand command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoCommand(){
        ICommand command = commandHistory.pop();
        if (command != null)
            command.undo();
    }
}
