package me.jcala.jchat.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import me.jcala.jchat.domain.User;
import me.jcala.jchat.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserServiceImpl userService;

    @PostMapping("/login.action")
    public String login(@ModelAttribute User user, Model model){
        try {
            String data= userService.login(user.getName(),user.getPass());
            if (data!=null){
                model.addAttribute("data",data);
            }
        } catch (JsonProcessingException e) {
            System.out.print(e.getLocation());
        }
        return "chat";
    }
}
