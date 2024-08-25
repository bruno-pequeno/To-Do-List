package com.pequeno.to_do_list.services;

import com.pequeno.to_do_list.domain.entities.TaskModel;
import com.pequeno.to_do_list.domain.repositories.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public ResponseEntity<TaskModel> saveTask(TaskModel task){
        TaskModel taskSaved = taskRepository.save(task);
        if(task.getName().isEmpty()) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(taskSaved);
    }
}
