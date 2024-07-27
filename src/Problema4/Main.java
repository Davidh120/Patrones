package Problema4;

public class Main {
     public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        App app = new App();

        Command createTask = new CreateCommand(taskManager);
        app.executeCommand(createTask);

        Command editTask = new EditCommand(taskManager);
        app.executeCommand(editTask);

        Command deleteTask = new DeleteCommand(taskManager);
        app.executeCommand(deleteTask);

        Command completeTask = new CompleteCommand(taskManager);
        app.executeCommand(completeTask);

        app.undoCommand();
    }
}
