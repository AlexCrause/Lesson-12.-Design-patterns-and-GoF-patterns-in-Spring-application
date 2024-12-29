package com.example.Task_Management.models;

public abstract class Task {

    protected String description;
    protected String priority;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}






