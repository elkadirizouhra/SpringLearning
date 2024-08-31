package com.example.walletapp.services;

import com.example.walletapp.models.Account;
import com.example.walletapp.repositories.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.List;

@Service
public class TransfertService {
    private final AccountRepository accountRepo;
    TransfertService(AccountRepository accountRepo){
        this.accountRepo=accountRepo;
    }
    @Transactional
    public void TrasfertMoney(int idReceiver, int idSender, BigDecimal amount){
        Account receiver=accountRepo.findAccountById(idReceiver);
        Account sender=accountRepo.findAccountById(idSender);
        BigDecimal senderNewAmount=sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount=receiver.getAmount().add(amount);
        accountRepo.changeAmount(idReceiver,receiverNewAmount);
        accountRepo.changeAmount(idSender,senderNewAmount);


    }
    public Iterable<Account> getAllAccounts(){
        return accountRepo.findAll();
    }
}
