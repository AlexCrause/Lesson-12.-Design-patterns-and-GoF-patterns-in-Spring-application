package com.example.Task_Management.factory;

import com.example.Task_Management.models.Task;
import com.example.Task_Management.models.UrgentTask;
import org.springframework.stereotype.Component;

@Component
public class UrgentTaskFactory implements TaskFactory {

    @Override
    public Task createTask(String description) {
        return new UrgentTask(description);
    }
}
