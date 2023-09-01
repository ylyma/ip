package kiera.command;

import kiera.Storage;
import kiera.TaskList;
import kiera.tasktype.TaskType;
import kiera.Ui;

public abstract class Command {
    private String desc;
    private TaskType t;
    public Command() {
    }
    public void setDescription(String desc) {
        this.desc = desc;
    }
    public void setTaskType(TaskType t) {
        this.t = t;
    }
    public String getDescription() {
        return this.desc;
    }
    public TaskType getTaskType() {
        return this.t;
    }
    public abstract void execute(TaskList tasks, Ui ui, Storage storage);

    public abstract boolean isExit();
}