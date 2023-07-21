package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.entity.Todo;
import com.example.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository repository;

    public List<Task> getTodos(int idTodo) {
        return repository.findTasksByTodo_Id(idTodo);
    }
}
