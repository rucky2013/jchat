package me.jcala.jchat.controller;

import me.jcala.jchat.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("/login.action")
    public String login(User user){
        return "";
    }
}
