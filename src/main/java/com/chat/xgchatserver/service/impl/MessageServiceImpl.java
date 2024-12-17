package com.chat.xgchatserver.service.impl;

import com.chat.xgchatserver.entity.MessageEntity;
import com.chat.xgchatserver.mapper.MessageMapper;
import com.chat.xgchatserver.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    public List<MessageEntity> messages(String roomId) {
        List<MessageEntity> messages = messageMapper.messages(roomId);
        return messages;
    }
}
