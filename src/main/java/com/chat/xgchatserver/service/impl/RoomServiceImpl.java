package com.chat.xgchatserver.service.impl;

import com.chat.xgchatserver.entity.RoomEntity;
import com.chat.xgchatserver.entity.UserEntity;
import com.chat.xgchatserver.mapper.RoomMapper;
import com.chat.xgchatserver.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Autowired
    private UserServiceImpl userService;

    public List<RoomEntity> rooms(String roomName) {
        List<RoomEntity> rooms = roomMapper.rooms(roomName);
        for (RoomEntity room : rooms) {
            List<UserEntity> users = userService.roomUsers(room.getRoomId());
            room.setUsers(users);
        }
        return rooms;
    }
}
