package com.example.demo.model;

public class message {
    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "message{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
