package com.pequeno.to_do_list.application;

import com.pequeno.to_do_list.domain.entities.TaskModel;
import com.pequeno.to_do_list.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {
    TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskModel> saveTask(TaskModel taskRecived){
        return taskService.saveTask(taskRecived);
    }
}
