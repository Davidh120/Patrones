package Problema4;

public class DeleteCommand extends Command {

    protected DeleteCommand(TaskManager taskManager) {
        super(taskManager);
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
