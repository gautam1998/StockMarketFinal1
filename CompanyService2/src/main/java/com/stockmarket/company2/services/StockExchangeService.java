package com.stockmarket.company2.services;

import org.springframework.stereotype.Service;

import com.stockmarket.company2.shared.StockExchangeDTO;

import java.util.List;

@Service
public interface StockExchangeService {
    public StockExchangeDTO createStockExchange(StockExchangeDTO stockExchangeDTO);
    public List<StockExchangeDTO> findAllStockExchanges();
    public StockExchangeDTO findStockExchangeByName(String name);
    public StockExchangeDTO findStockExchangeById(Integer id);
}
