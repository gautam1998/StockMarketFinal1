package com.stockmarket.company2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockmarket.company2.models.StockExchange;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchange,Integer> {
    public StockExchange findByName(String name);
}