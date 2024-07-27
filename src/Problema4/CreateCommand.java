package Problema4;

public class CreateCommand extends Command {

    protected CreateCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public void execute() {
        this.taskManager.createTask();
    }

    @Override
    public void undo() {
        this.taskManager.undoChange();
    }
}
