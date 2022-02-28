package com.example.mobile.server.api.dto;

import java.io.Serializable;

public class RequestCommonDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String caller;

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public RequestCommonDto() {
    }
}
