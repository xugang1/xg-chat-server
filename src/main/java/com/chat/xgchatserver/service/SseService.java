package com.chat.xgchatserver.service;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Map;

public interface SseService {
    public SseEmitter connect(Long userId);

    public boolean sendMessage(Long userId, String messageId, String message);

    public void deleteUser(Long userId);

    public Map<Long, SseEmitter> listSseConnect();
}
