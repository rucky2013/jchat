package me.jcala.jchat.controller;

import me.jcala.jchat.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/chat")
    public void handleChat(Message msg, SimpMessageHeaderAccessor headerAccessor) {
            String sender = (String) headerAccessor.getSessionAttributes().get("login");
            messagingTemplate.convertAndSendToUser("a","/queue/chat/message",msg);
    }


}
