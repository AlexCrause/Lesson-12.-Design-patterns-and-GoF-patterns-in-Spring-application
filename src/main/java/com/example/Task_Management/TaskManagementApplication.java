package com.example.Task_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Задание:
 *  1. Создайте Spring приложение для управления задачами (Task
 *  Management). Примените паттерн Singleton для создания сервиса
 *  управления задачами.
 *
 *  2. Реализуйте паттерн Observer для отслеживания изменений в
 *  состоянии задач и оповещения об этих изменениях подписчиков.
 *
 *  3. Используйте паттерн фабрики (Factory Method) для создания разных
 *  типов задач (например, задачи срочного и обычного выполнения).
 */
@SpringBootApplication
public class TaskManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}
}
