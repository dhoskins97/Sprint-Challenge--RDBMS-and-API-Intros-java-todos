package com.lambdaschool.todos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
public class Role
{
    @Id
    @Column(nullable = false)
    private long roleid;
    @Column(nullable = false)
    private String rolename;
}
