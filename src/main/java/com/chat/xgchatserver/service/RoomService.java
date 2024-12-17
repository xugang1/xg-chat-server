package com.chat.xgchatserver.service;

import com.chat.xgchatserver.entity.MessageEntity;
import com.chat.xgchatserver.entity.RoomEntity;

import java.util.List;

public interface RoomService {

    List<RoomEntity> rooms(String roomName);

}
