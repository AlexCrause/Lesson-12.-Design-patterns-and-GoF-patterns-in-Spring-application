package com.example.Task_Management.observer;

import com.example.Task_Management.models.Task;
import org.springframework.stereotype.Component;

@Component
public class NotificationService implements TaskObserver {
    @Override
    public void update(Task task) {
        System.out.println("Уведомление: задача обновлена - " + task);
    }
}

