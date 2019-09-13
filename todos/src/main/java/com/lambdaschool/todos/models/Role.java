package com.lambdaschool.todos.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long roleid;
    @Column(nullable = false)
    private String rolename;

    public Role(String rolename) {
        this.rolename = rolename;
    }

    public Role() {
    }

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
