package com.example.demo.controller;

import com.example.demo.model.message;
import com.example.demo.model.user;
import com.example.demo.proxies.BuyProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyController {
    private final BuyProxy paymentProxy;
    BuyController(BuyProxy paymentProxy){
        this.paymentProxy=paymentProxy;
    }

    @PostMapping("/buy")
    public ResponseEntity<message> buy(@RequestBody user user) {
        message message = new message();
        if (paymentProxy.createPayement(user)) {
            message.setMessage("succés");
            return ResponseEntity.ok().body(message);
        } else {
            message.setMessage("error");
            return ResponseEntity.ok().body(message);
        }


    }
}