package me.jcala.jchat.domain;

import lombok.Data;

@Data
public class Message {
    private String content;
    private String date;
    private User sender;
}
