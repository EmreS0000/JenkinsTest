package com.test.app.model;

public class User {
    private Long id;


    public User(Long id, String name) {
        this.id = id;


    }
    public User (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;


    }

}
