package com.zhl.spring.boot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity  
@Table(name = "user") 
public class User
{
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;  
  
    @Column(name = "name", nullable = true, length = 30)  
    private String name;  
  
    @Column(name = "sex", nullable = true, length = 2)  
    private char sex;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public char getSex()
    {
        return sex;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }  

}
