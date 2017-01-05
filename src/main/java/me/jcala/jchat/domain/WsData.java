package me.jcala.jchat.domain;


import lombok.Data;

import java.util.List;

@Data
public class WsData {
    private User user;
    private List<Session> sessions;
}
