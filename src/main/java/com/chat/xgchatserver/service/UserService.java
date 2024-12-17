package com.chat.xgchatserver.service;

import com.chat.xgchatserver.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> roomUsers(String roomId);
}
