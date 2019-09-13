package com.lambdaschool.todos.models;

import javax.persistence.*;

@Entity
@Table(name = "userroles")
public class Userrole
{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany(mappedBy = "roleid")
    private long roleid;

    @OneToMany(mappedBy = "userid")
    private long userid;

    public Userrole(long userid) {
        this.userid = userid;
    }

    public Userrole() {
    }

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
