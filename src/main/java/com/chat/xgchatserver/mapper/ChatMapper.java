package com.chat.xgchatserver.mapper;

import com.chat.xgchatserver.entity.RoomEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {

    List<RoomEntity> rooms(String roomName);
}
