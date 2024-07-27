package Problema4;

import java.util.Stack;

public class CommandHistory {
    private final Stack<ICommand> history = new Stack<ICommand>();

    void push(ICommand command) {
        history.push(command);
    }

    ICommand pop(){
        return history.isEmpty() ? null : history.pop();
    }
}
