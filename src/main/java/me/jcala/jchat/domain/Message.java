package me.jcala.jchat.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private String content;
    private Date date;
}
