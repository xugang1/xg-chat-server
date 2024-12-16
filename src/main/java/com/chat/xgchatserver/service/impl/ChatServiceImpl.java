package com.chat.xgchatserver.service.impl;

import com.chat.xgchatserver.entity.RoomEntity;
import com.chat.xgchatserver.mapper.ChatMapper;
import com.chat.xgchatserver.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatMapper chatMapper;

    public List<RoomEntity> rooms(String roomName) {
        return chatMapper.rooms(roomName);
    }
}
