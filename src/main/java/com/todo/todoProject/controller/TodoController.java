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
    @PutMapping("/update")
    public void updateTask(@RequestBody Todo todo){
        todoService.updateTask(todo);
    }

    @GetMapping("/listOfAllTodoTask")
    public List<Todo> listOfAllTodoTask(){
        return todoService.listOfAllTodoTask();
    }

    @DeleteMapping("/delete/{taskId}")
    public void deleteTodo(@PathVariable int taskId){
        todoService.deleteTodo(taskId);
    }

}
