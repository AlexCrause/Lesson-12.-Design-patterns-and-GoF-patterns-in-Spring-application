package com.example.Task_Management.controllers;

import com.example.Task_Management.factory.RegularTaskFactory;
import com.example.Task_Management.factory.UrgentTaskFactory;
import com.example.Task_Management.observer.NotificationService;
import com.example.Task_Management.service.TaskManager;
import com.example.Task_Management.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskManager taskManager;
    private final UrgentTaskFactory urgentTaskFactory;
    private final RegularTaskFactory regularTaskFactory;

    public TaskController(TaskManager taskManager,
                          UrgentTaskFactory urgentTaskFactory,
                          RegularTaskFactory regularTaskFactory) {
        this.taskManager = taskManager;
        this.urgentTaskFactory = urgentTaskFactory;
        this.regularTaskFactory = regularTaskFactory;

        taskManager.addObserver(new NotificationService());
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String type, @RequestParam String description) {
        Task task;
        if ("urgent".equalsIgnoreCase(type)) {
            task = urgentTaskFactory.createTask(description);
        } else {
            task = regularTaskFactory.createTask(description);
        }
        taskManager.addTask(task);
        return "Задача добавлена: " + task;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskManager.getTasks();
    }
}
