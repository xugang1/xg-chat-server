package com.chat.xgchatserver.service.impl;

import com.chat.xgchatserver.entity.UserEntity;
import com.chat.xgchatserver.mapper.UserMapper;
import com.chat.xgchatserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> roomUsers(String roomId){
        List<UserEntity> users = userMapper.roomUsers(roomId);
        return users;
    }
}
