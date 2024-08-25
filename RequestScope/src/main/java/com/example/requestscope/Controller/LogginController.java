package com.example.requestscope.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogginController {
    private final loginProcessor loginProcessor;

    @Autowired
    public LogginController(loginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String GetLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String LoginPoste(@RequestParam String username, @RequestParam String password , Model model){
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        if(loginProcessor.login()){
            model.addAttribute("message","you are logged In");

        }
        else{
            model.addAttribute("message","log In failed");

        }

        return "login.html";

    }
}
