package Problema4;

public class CompleteCommand extends Command {

    protected CompleteCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public void execute() {
        taskManager.completeTask();
    }

    @Override
    public void undo() {
        taskManager.undoChange();
    }
}
