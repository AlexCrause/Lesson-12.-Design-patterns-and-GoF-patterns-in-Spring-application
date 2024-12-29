package com.example.Task_Management.factory;


import com.example.Task_Management.models.Task;

public interface TaskFactory {

    Task createTask(String description);
}

