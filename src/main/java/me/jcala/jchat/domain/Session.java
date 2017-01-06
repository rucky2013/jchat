package me.jcala.jchat.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Session {
    private int id;
    private User user;
    private List<Message> messages;

    public Session(int id,User user,List<Message> messages) {
        this.id=id;
        this.user=user;
        this.messages=messages;
    }
}
