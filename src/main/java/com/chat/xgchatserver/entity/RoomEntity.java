package com.chat.xgchatserver.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomEntity {

    @JsonProperty("roomId")
    private String roomId;

    @JsonProperty("roomName")
    private String roomName;

    @JsonProperty("avatar")
    private String avatar;

    @JsonProperty("unreadCount")
    private int unreadCount;
}
