package com.ranchosoftware.message;

public class EchoResponseMessage {

    private String message;
    public EchoResponseMessage(String message){
        message = message;
    }

    public String getMessage() {
        return message;
    }
}
