package com.todo.todoProject.controller;

import com.todo.todoProject.model.Todo;
import com.todo.todoProject.service.TodoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TodoController {


    TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addTask(@RequestBody Todo todo) {
        todoService.addTask(todo);
        return ResponseEntity.ok("Task has been added");
    }

    /*
    in the blow method I should be able to update the existing todolist
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateTask(@RequestBody Todo todo){
        todoService.updateTask(todo);
        return ResponseEntity.ok("Task has been updated");
    }

    @GetMapping("/listOfAllTodoTask")
    public ResponseEntity<List<Todo>> listOfAllTodoTask(){
        return ResponseEntity.ok(todoService.listOfAllTodoTask());
    }

    @DeleteMapping("/delete/{taskId}")
    public ResponseEntity<String> deleteTodo(@PathVariable int taskId){
        todoService.deleteTodo(taskId);
        return ResponseEntity.ok("Task has been deleted");
    }

}
