package Problema4;

public class EditCommand extends Command {

    protected EditCommand(TaskManager taskManager) {
        super(taskManager);
    }

    @Override
    public void execute() {
        taskManager.editTak();
    }

    @Override
    public void undo() {
        taskManager.undoChange();
    }
}
