package com.todo.todoProject.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
TODO
 we are going give todo data
 no, ,task, discription, status, add, update, delete task
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {


    private  int taskId;
    private String taskName;
    private String disc;
    private boolean taskStatus;



}
