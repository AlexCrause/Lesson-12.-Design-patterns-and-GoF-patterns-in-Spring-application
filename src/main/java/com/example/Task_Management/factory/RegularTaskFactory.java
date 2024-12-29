package com.example.Task_Management.factory;

import com.example.Task_Management.models.RegularTask;
import com.example.Task_Management.models.Task;
import org.springframework.stereotype.Component;

@Component
public class RegularTaskFactory implements TaskFactory {


    @Override
    public Task createTask(String description) {
        return new RegularTask(description);
    }
}
