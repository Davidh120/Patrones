package Problema4;

public class EditCommand implements ICommand{
    private final TaskManager taskManager;

    public  EditCommand(TaskManager taskManager){
        this.taskManager = taskManager;
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
