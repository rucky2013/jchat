package me.jcala.jchat.service.inster;

import com.fasterxml.jackson.core.JsonProcessingException;
import me.jcala.jchat.domain.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    String login(String name,String pass) throws JsonProcessingException;

    void addSession(HttpServletRequest request, User user);
}
