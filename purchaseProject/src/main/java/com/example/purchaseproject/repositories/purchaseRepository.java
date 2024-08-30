package com.example.purchaseproject.repositories;

import com.example.purchaseproject.model.purchase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class purchaseRepository {
    private final JdbcTemplate jdbcTemplate;
    purchaseRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public void storePurchase(purchase purchase){
        String sql="insert into purchase values (?,?,?)";
        jdbcTemplate.update(sql,purchase.getId(),purchase.getProduct(),purchase.getPrice());
    }
    public List<purchase> findAllPurchase(){
        String sql="select * from purchase ";
        RowMapper<purchase> purchaseRowMapper=(r,i)->{
            purchase purchaseRowObject=new purchase();
            purchaseRowObject.setId(r.getInt("id"));
            purchaseRowObject.setProduct(r.getString("product"));
            purchaseRowObject.setPrice(r.getInt("price"));

            return purchaseRowObject;
        };
        return jdbcTemplate.query(sql,purchaseRowMapper);

    }
}
