package com.example.requestscope.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class loginProcessor {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(){
        String username=this.getUsername();
        String password=this.getPassword();
        if("natalie".equals(username) && "password".equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
