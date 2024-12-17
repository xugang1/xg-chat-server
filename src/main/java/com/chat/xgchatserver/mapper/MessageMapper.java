package com.chat.xgchatserver.mapper;

import com.chat.xgchatserver.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    List<MessageEntity> messages(String roomId);

}
