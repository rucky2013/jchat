package me.jcala.jchat.domain;

import lombok.Data;

@Data
public class User {
    private String name;
    private String pass;
    private String img;

    public User(String name,String img) {
        this.name=name;
        this.img=img;
    }
    public User() {
    }
}
