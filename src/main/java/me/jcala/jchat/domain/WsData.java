package me.jcala.jchat.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WsData {
    private User user;
    private List<Session> sessions;

    public WsData(User user,List<Session> sessions) {
        this.user=user;
        this.sessions=sessions;
    }
}
