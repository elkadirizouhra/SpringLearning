package com.example.requestscope.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserServiceManagament {
    private String username;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "LoggedUserServiceManagament{" +
                "username='" + username + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
