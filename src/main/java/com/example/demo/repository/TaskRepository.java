package com.example.demo.repository;

import com.example.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findTasksByTodo_Id(int idTodo);

    @Query("SELECT t FROM Task t WHERE t.todo.id = ?1")
    List<Task> get_task_todo_id(int idTodo);
}
