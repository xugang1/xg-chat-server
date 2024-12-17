package com.chat.xgchatserver.mapper;

import com.chat.xgchatserver.entity.MessageEntity;
import com.chat.xgchatserver.entity.RoomEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {

    List<RoomEntity> rooms(String roomName);

}
