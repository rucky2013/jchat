package me.jcala.jchat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Message {
    private String content;
    private String date;
    private User sender;

    public Message(String content) {
        this.content=content;
        this.date=new Date().toString();
    }
}
