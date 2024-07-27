package Problema4;

public class Main {
     public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        App app = new App();

        ICommand createTask = new CreateCommand(taskManager);
        app.executeCommand(createTask);

        ICommand editTask = new EditCommand(taskManager);
        app.executeCommand(editTask);

        ICommand deleteTask = new DeleteCommand(taskManager);
        app.executeCommand(deleteTask);

        ICommand completeTask = new CompleteCommand(taskManager);
        app.executeCommand(completeTask);

        app.undoCommand();
    }
}
