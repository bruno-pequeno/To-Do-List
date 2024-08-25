package com.pequeno.to_do_list.domain.repositories;

import com.pequeno.to_do_list.domain.entities.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
}
