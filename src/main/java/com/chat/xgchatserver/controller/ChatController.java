package com.chat.xgchatserver.controller;


import com.chat.xgchatserver.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/chat")
@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/rooms")
    public String rooms(@RequestParam(name = "roomName", required = false) String roomName) {
        return chatService.rooms(roomName);
    }
}
