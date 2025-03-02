package com.todo.todoProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


/*
TODO
 we are going give todo data
 no, ,task, discription, status, add, update, delete task
 */
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int taskId;
    private String taskName;
    private String disc;
    private boolean taskStatus;



}
