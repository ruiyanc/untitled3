package com.rui.web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Admin {
    private int id;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(Person person) {
        System.out.println(person.toString());
    }

    public Admin(String username) {
        this.username = username;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        System.out.println("打印一句话");
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
