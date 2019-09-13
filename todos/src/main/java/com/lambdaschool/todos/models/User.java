package com.lambdaschool.todos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class User
{
    @Id
    @Column(nullable = false)
    private long userid;

    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
}
