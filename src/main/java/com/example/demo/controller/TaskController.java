package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.entity.Todo;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {
    private TaskService service;

    @GetMapping("/todo/{id_todo}/tasks")
    public List<Task> todos(@RequestParam(name = "id_todo")int idTodo){
        return service.getTodos(idTodo);
    }
}
