package com.chat.xgchatserver.service;

import com.chat.xgchatserver.entity.RoomEntity;

import java.util.List;

public interface ChatService {

    List<RoomEntity> rooms(String roomName);


}
