package com.elevate.softwarecompany.controller;

import com.elevate.softwarecompany.model.CompanyComment;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController {

    @MessageMapping("/send-comment")
    @SendTo("/topic/software-company")
    public CompanyComment sendMessage(@Payload CompanyComment companyComment) {
        return companyComment;
    }

    @MessageMapping("/new-user")
    @SendTo("/topic/software-company")
    public CompanyComment newUser(@Payload CompanyComment companyComment,
                                        SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", companyComment.getSender());
        return companyComment;
    }
}
