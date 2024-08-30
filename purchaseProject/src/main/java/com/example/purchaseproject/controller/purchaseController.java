package com.example.purchaseproject.controller;

import com.example.purchaseproject.model.purchase;
import com.example.purchaseproject.repositories.purchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class purchaseController {
   private final purchaseRepository purchaseRepository;
   purchaseController(purchaseRepository purchaseRepository){
       this.purchaseRepository=purchaseRepository;
   }
   @PostMapping
    public void createPurchase(@RequestBody purchase purchase){

      purchaseRepository.storePurchase(purchase);
    }
    @GetMapping
    public List<purchase> getAllPurchase(){

       return purchaseRepository.findAllPurchase();
    }
}
