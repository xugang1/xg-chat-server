package com.chat.xgchatserver.controller;

import com.chat.xgchatserver.entity.MessageEntity;
import com.chat.xgchatserver.result.Result;
import com.chat.xgchatserver.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class MessageController {

    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("/messages")
    public Result<List<MessageEntity>> messages(@RequestParam(name = "roomId") String roomId) {
        List<MessageEntity> messages = messageService.messages(roomId);
        return Result.success(messages);
    }
}
