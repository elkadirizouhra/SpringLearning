package com.example.walletapp.controller;

import com.example.walletapp.DTO.TransferRequest;
import com.example.walletapp.models.Account;
import com.example.walletapp.services.TransfertService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private final TransfertService transfertService;
    AccountController(TransfertService transfertService){
        this.transfertService=transfertService;
    }
    @PostMapping("/transfert")
    public void transferMoney(@RequestBody TransferRequest transferRequest){
        transfertService.TrasfertMoney(transferRequest.getIdReceiver(), transferRequest.getIdSender(), transferRequest.getAmount());

    }
    @GetMapping("/accounts")
    public Iterable<Account> findAllAccount(){
       return  transfertService.getAllAccounts();}
}
