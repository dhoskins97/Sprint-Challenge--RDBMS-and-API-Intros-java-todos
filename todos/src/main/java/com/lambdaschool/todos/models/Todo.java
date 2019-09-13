package com.lambdaschool.todos.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "todos")
public class Todo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long todoid;

    @Column(nullable = false)
    private String description;
    private LocalDateTime datestarted;
    private boolean completed;

    @OneToMany(mappedBy = "todos")
    private long userid;

    public Todo(String description, LocalDateTime datestarted, boolean completed, long userid) {
        this.description = description;
        this.datestarted = datestarted;
        this.completed = completed;
        this.userid = userid;
    }

    public Todo() {
    }


    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatestarted() {
        return datestarted;
    }

    public void setDatestarted(LocalDateTime datestarted) {
        this.datestarted = datestarted;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
