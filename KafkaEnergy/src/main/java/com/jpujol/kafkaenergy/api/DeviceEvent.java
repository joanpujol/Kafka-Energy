package com.jpujol.kafkaenergy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceEvent {
    private long id;

    private String content;

    public DeviceEvent() {
        // Jackson deserialization
    }

    public DeviceEvent(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
