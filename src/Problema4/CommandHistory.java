package Problema4;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> history = new Stack<Command>();

    void push(Command command) {
        history.push(command);
    }

    Command pop(){
        return history.isEmpty() ? null : history.pop();
    }
}
