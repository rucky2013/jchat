package me.jcala.jchat.domain;

import lombok.Data;

import java.util.List;

@Data
public class Session {
    private int id;
    private User user;
    private List<Message> messages;
}
