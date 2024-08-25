package com.example.requestscope.Services;

import com.example.requestscope.Services.LoggedUserServiceManagament;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class loginProcessor {
    private String username;
    private String password;
    private final LoggedUserServiceManagament loggedUserServiceManagament;
    public loginProcessor(LoggedUserServiceManagament loggedUserServiceManagament){
        this.loggedUserServiceManagament=loggedUserServiceManagament;
    }

    public LoggedUserServiceManagament getLoggedUserServiceManagament() {
        return loggedUserServiceManagament;
    }

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
        boolean resultLoggin=false;
        if("natalie".equals(username) && "password".equals(password)){
           resultLoggin=true;
           loggedUserServiceManagament.setUsername(username);
        }
        return resultLoggin;
    }
}
