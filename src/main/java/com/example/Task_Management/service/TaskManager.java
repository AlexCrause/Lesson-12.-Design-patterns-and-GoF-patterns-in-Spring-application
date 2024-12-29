package com.example.Task_Management.service;

import com.example.Task_Management.observer.TaskObserver;
import com.example.Task_Management.models.Task;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton
 */

@Service
public class TaskManager {

    private final List<TaskObserver> observers = new ArrayList<>();
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers(task);
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Task task) {
        for (TaskObserver observer : observers) {
            observer.update(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
