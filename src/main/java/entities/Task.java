package entities;

public class Task {

    private String taskName;

    private String taskDescription;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Task(String taskname, String taskDescription) {
        this.taskName = taskname;
        this.taskDescription = taskDescription;
    }

    public Task(String taskname) {
        this.taskName = taskname;
    }
}
