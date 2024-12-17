package com.chat.xgchatserver.service;

import com.chat.xgchatserver.entity.MessageEntity;

import java.util.List;

public interface MessageService {

    List<MessageEntity> messages(String roomId);
}
