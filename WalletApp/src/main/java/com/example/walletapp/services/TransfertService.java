package com.example.walletapp.services;

import com.example.walletapp.models.Account;
import com.example.walletapp.repositories.AccountRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransfertService {
    private final AccountRepo accountRepo;
    TransfertService(AccountRepo accountRepo){
        this.accountRepo=accountRepo;
    }
    @Transactional
    public void TrasfertMoney(int idReceiver, int idSender, BigDecimal amount){
        Account receiver=accountRepo.FindAccountById(idReceiver);
        Account sender=accountRepo.FindAccountById(idSender);
        BigDecimal senderNewAmount=sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount=receiver.getAmount().add(amount);
        accountRepo.changeAmount(idReceiver,receiverNewAmount);
        accountRepo.changeAmount(idSender,senderNewAmount);


    }
    public List<Account> findAllAccount(){
        return accountRepo.findAllAccount();
    }
}
