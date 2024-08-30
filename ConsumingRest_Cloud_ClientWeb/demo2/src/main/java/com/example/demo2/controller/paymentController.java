package com.example.demo2.controller;

import com.example.demo2.model.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paymentController {
    @PostMapping("/payment")
    public boolean createpayement(@RequestBody user user){
        return false;
    }

}
