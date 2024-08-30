package com.example.walletapp.repositories;

import com.example.walletapp.models.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class AccountRepo {
    private final JdbcTemplate jdbcTemplate;
    AccountRepo(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public Account FindAccountById(int id){
        String sql="select * from account where id=?";
        return jdbcTemplate.queryForObject(sql,new AccountRowMapper(),id);

    }
    public void changeAmount(int id , BigDecimal amount){
        String sql="update account set amount=? where id=?";
        jdbcTemplate.update(sql,amount,id);

    }
    public List<Account> findAllAccount(){
        String sql="select * from account";
        return jdbcTemplate.query(sql , new AccountRowMapper());

    }
}
