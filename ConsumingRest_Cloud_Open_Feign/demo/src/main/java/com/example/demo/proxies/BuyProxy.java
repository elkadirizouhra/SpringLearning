package com.example.demo.proxies;

import com.example.demo.model.user;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name="buy",url="localhost:9090")
public interface BuyProxy {


    @PostMapping("/payment")
    boolean createPayement(@RequestBody user user);
}
