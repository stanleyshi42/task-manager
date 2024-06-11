package com.example.task_manager.controller;

import com.example.task_manager.entity.Task;
import com.example.task_manager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @PutMapping("/tasks")
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTaskById(@PathVariable long id) {
        taskService.deleteTaskById(id);
    }

}
