package com.todo.todoProject.controller;

import com.todo.todoProject.model.Todo;
import com.todo.todoProject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /*
    in the blow method I should be able to update the existing todolist
     */
    @PutMapping("/update/{taskId}")
    public void updateTask(int taskId){
        todoService.updateTask(taskId);
    }

    @GetMapping("/listOfAllTodoTask")
    public List<Todo> listOfAllTodoTask(){
        return todoService.listOfAllTodoTask();
    }

}
