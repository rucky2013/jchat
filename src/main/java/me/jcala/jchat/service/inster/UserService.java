package me.jcala.jchat.service.inster;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserService {

    String login(String name,String pass) throws JsonProcessingException;

}
