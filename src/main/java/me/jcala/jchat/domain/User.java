package me.jcala.jchat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String name;
    private String pass;
    private String img;

    public User(String name,String img) {
        this.name=name;
        this.img=img;
    }
}
