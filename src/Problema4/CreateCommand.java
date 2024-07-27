package Problema4;

public class CreateCommand implements ICommand{
    private final TaskManager taskManager;

    public CreateCommand(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.createTask();
    }

    @Override
    public void undo() {
        taskManager.undoChange();
    }
}
