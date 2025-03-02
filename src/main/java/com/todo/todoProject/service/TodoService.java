package com.todo.todoProject.service;

import com.todo.todoProject.model.Todo;
import com.todo.todoProject.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {


    @Autowired
    TodoRepo todoRepo;

    public void addTask(Todo todo) {
        Todo newTodo = new Todo();
        newTodo.setTaskId(todo.getTaskId());
        newTodo.setTaskName(todo.getTaskName());
        newTodo.setDisc(todo.getDisc());
        todoRepo.save(newTodo);
    }
}
