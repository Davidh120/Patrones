package Problema4;

public abstract class Command {
    protected final TaskManager taskManager;

    protected Command(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    abstract void execute();
    abstract  void undo();
}
