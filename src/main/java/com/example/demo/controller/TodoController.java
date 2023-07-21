package com.example.demo.controller;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class TodoController {
    private TodoRepository repository;

    @GetMapping("/todos")
    public List<Todo> todos(){
        return repository.findAll();
    }

    @PutMapping("/todos")
    public List<Todo> crUpdate(@RequestBody List<Todo> toInsert){
        return repository.saveAll(toInsert);
    }
}
