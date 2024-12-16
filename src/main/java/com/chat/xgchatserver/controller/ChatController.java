package com.chat.xgchatserver.controller;


import com.chat.xgchatserver.entity.RoomEntity;
import com.chat.xgchatserver.result.Result;
import com.chat.xgchatserver.service.impl.ChatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/chat")
@RestController
public class ChatController {

    @Autowired
    private ChatServiceImpl chatService;

    @GetMapping("/rooms")
    public Result<List<RoomEntity>> rooms(@RequestParam(name = "roomName", required = false) String roomName) {
        List<RoomEntity> rooms = chatService.rooms(roomName);
        return Result.success(rooms);
    }
}
