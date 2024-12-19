package com.chat.xgchatserver.controller;

import com.chat.xgchatserver.result.Result;
import com.chat.xgchatserver.service.impl.SseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/SseEmitter")
public class SseController {

    @Autowired
    private SseServiceImpl sseService;

    @GetMapping(value = "/createSseConnect", produces = "text/event-stream;charset=UTF-8")
    public SseEmitter createSseConnect(@RequestParam(name = "clientId", required = false) Long clientId) {
        return sseService.connect(clientId);
    }

    @PostMapping(value = "/sendMessage")
    public Boolean sendMessage(@RequestParam("clientId") Long clientId, @RequestParam("message") String message) {
        return sseService.sendMessage(clientId, "123456789", message);
    }

    @GetMapping(value = "/listSseConnect")
    public Result<Map<Long, SseEmitter>> listSseConnect() {
        Map<Long, SseEmitter> sseEmitterMap = sseService.listSseConnect();
        return Result.success(sseEmitterMap);
    }

    /*
    * 关闭SSE连接
    * */
    @GetMapping("/closeSseConnect")
    public Result closeSseConnect(Long clientId) {
        sseService.deleteUser(clientId);
        return Result.success(null);
    }

}
