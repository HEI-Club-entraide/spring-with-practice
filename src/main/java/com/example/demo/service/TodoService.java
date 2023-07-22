package com.example.demo.service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository repository;
    private final TaskRepository taskRepository;

    public List<Todo> getTodos(){
       List<Todo> domain =  repository.findAll();
       domain.forEach(
                todo -> {
                    todo.setTasks(taskRepository.get_task_todo_id(todo.getId()));
                });
    return domain;
    }
}
