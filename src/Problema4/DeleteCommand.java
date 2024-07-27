package Problema4;

public class DeleteCommand implements ICommand{
    private final TaskManager taskManager;

    public DeleteCommand(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.deleteTask();
    }

    @Override
    public void undo() {
        taskManager.undoChange();
    }
}
