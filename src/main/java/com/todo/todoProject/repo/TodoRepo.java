package com.todo.todoProject.repo;

import com.todo.todoProject.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo, Integer> {

}
