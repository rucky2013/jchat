package me.jcala.jchat.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import me.jcala.jchat.domain.User;
import me.jcala.jchat.service.UserServiceImpl;
import me.jcala.jchat.service.inster.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login.action")
    public String doLogin(@ModelAttribute("user") User user, HttpServletRequest request, Model model){
        try {
            String data= userService.login(user.getName(),user.getPass());
            if (data!=null){
                userService.addSession(request,user);
                model.addAttribute("data",data);
            }
        } catch (JsonProcessingException e) {
            System.out.print(e.getLocation());
        }
        return "chat";
    }
}
