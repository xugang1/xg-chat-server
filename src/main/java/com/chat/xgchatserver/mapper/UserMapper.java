package com.chat.xgchatserver.mapper;

import com.chat.xgchatserver.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserEntity> roomUsers(String roomId);

}
