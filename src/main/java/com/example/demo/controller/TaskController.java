package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.entity.Todo;
import com.example.demo.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {
    private TaskService service;

    @PutMapping("/todo/{id_todo}/tasks")
    public Todo crUpdate(
            @RequestBody List<Task> toInsert,
            @PathVariable(name = "id_todo")int idTodo
            ){
        return service.insertTask(idTodo, toInsert);
    }

    @GetMapping("/todo/{id_todo}/tasks")
    public List<Task> todos(@RequestParam(name = "id_todo")int idTodo){
        return service.getTodos(idTodo);
    }
}
