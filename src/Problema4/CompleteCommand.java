package Problema4;

public class CompleteCommand implements ICommand{
    private final TaskManager taskManager;

    public  CompleteCommand(TaskManager taskManager){
        this.taskManager = taskManager;
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
