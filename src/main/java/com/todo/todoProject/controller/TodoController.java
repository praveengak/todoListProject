package com.todo.todoProject.controller;

import com.todo.todoProject.model.Todo;
import com.todo.todoProject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("/add")
    public void addTask(@RequestBody Todo todo) {
        todoService.addTask(todo);
    }

}
