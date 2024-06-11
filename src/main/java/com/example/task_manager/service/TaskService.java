package com.example.task_manager.service;

import com.example.task_manager.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.example.task_manager.repository.TaskDAO;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    public TaskDAO dao;

    public List<Task> getAllTasks() {
        return dao.findAll();
    }

    public Task getTaskById(long id) {

        Optional<Task> t = dao.findById(id);

        if (t.isPresent())
            return t.get();
        else
            return null;

    }

    public Task addTask(Task task) {
        return dao.save(task);
    }

    public Task updateTask(Task task) {
        return dao.save(task);
    }

    public void deleteTaskById(long id) {
        dao.deleteById(id);
    }

}
