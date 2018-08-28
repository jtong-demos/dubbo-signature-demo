package com.thoughtworks.jtong.demos.dubbo;

import java.io.Serializable;

public class MyResponse implements Serializable {
    private String response;

    public MyResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
