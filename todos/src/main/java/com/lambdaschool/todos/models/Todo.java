package com.lambdaschool.todos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "todos")
public class Todo
{
    @Id
    @Column(nullable = false)
    private long todoid;

    @Column(nullable = false)
    private String description;
    private LocalDateTime datestarted;
    private boolean completed;


    private long userid;
}
