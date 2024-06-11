package com.example.task_manager.repository;

import com.example.task_manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDAO extends JpaRepository<Task, Long> {
}
