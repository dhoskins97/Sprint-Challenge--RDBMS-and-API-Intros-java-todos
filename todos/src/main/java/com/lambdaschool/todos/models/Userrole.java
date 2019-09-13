package com.lambdaschool.todos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userroles")
public class Userrole
{
   private long roleid;

   private long userid;
}
