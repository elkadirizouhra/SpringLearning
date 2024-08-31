package com.example.walletapp.repositories;

import com.example.walletapp.models.Account;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account,Integer> {
    @Query("select * from account where name= :name")
    List<Account> findAccountsByName(String name);
    @Query("select * from account where id= :id")
    Account findAccountById(int id);
    @Query("select * from account")
    List<Account> findAll();
    @Modifying
    @Query("update account set amount= :amount where id= :id")
    void changeAmount(int id , BigDecimal amount);

}
