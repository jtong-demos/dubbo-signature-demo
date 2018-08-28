package com.thoughtworks.jtong.demos.dubbo;

import java.io.Serializable;

public class MyMessage implements Serializable {
    private String message;

    public MyMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
