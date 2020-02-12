package com.msd.api.model;

import java.io.Serializable;

public class ResponseVo implements Serializable {

    private final String token;

    public ResponseVo(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

}
