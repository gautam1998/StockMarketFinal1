package com.stockmarket.company2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stockmarket.company2.services.StockExchangeService;
import com.stockmarket.company2.shared.StockExchangeDTO;

import java.util.List;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/stockExchange2")
public class StockExchangeController {

    @Autowired
    private StockExchangeService stockExchangeService;

//    public StockExchangeController(StockExchangeService stockExchangeService) {
//        this.stockExchangeService = stockExchangeService;
//    }


    public StockExchangeController() {
        
    }

    @GetMapping("/test")
    @LoadBalanced
    public String test() {
        return "stock exchange service is working";
    }

    @GetMapping("/all")
    @LoadBalanced
    public ResponseEntity<?> getAllStockExchanges() {
    	System.out.println("______________________________________________________________________________");
        List<StockExchangeDTO> list = stockExchangeService.findAllStockExchanges();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PostMapping("/addStockExchange")
    @LoadBalanced
    public ResponseEntity<StockExchangeDTO> addStockExchange(@RequestBody StockExchangeDTO stockExchangeDTO) {
        StockExchangeDTO stockExchangeDTO1 = stockExchangeService.createStockExchange(stockExchangeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockExchangeDTO1);
    }

    @GetMapping("/{name}")
    @LoadBalanced
    public ResponseEntity<StockExchangeDTO> getStockExchangeByName(@PathVariable String name) {
        StockExchangeDTO stockExchangeDTO = stockExchangeService.findStockExchangeByName(name);
        return ResponseEntity.status(HttpStatus.FOUND).body(stockExchangeDTO);
    }

    @GetMapping("/id/{id}")
    @LoadBalanced
    public ResponseEntity<StockExchangeDTO> getStockExchangeById(@PathVariable Integer id) {
        StockExchangeDTO stockExchangeDTO = stockExchangeService.findStockExchangeById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(stockExchangeDTO);
    }
}

// Test object for Postman

//{
//        "name": "NYSE",
//        "brief": "nothing much",
//        "contactAddress": "new york",
//        "remarks":"biggest"
//}