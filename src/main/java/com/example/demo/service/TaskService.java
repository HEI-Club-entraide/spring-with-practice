package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.entity.Todo;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository repository;
    private TodoRepository todoRepository;

    public List<Task> getTodos(int idTodo) {
        return repository.findTasksByTodo_Id(idTodo);
    }

    public Todo insertTask(int taskId, List<Task> toInsert) {
        Todo thisTodo = todoRepository.findById(taskId).get();
        for(Task task : toInsert){
            task.setTodo(thisTodo);
            repository.save(task);
        }
        return thisTodo;
    }
}
