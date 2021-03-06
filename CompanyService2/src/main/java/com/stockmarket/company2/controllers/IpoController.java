package com.stockmarket.company2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stockmarket.company2.services.IPOService;
import com.stockmarket.company2.shared.IpoDTO;

import java.util.List;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
@RestController
@RequestMapping("/api/ipo2")
public class IpoController {

    private IPOService ipoService;

    public IpoController(IPOService ipoService) {
        this.ipoService = ipoService;
    }

    public IpoController() {
    }

    @GetMapping("/test")
    @LoadBalanced
    public String test() {
        return "ipo-service is working";
    }

    @PostMapping("/add")
    @LoadBalanced
    public ResponseEntity<IpoDTO> createIPO(@RequestBody IpoDTO ipoDTO) {
        IpoDTO ipoDTO1 = ipoService.addIPO(ipoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ipoDTO1);
    }

    @GetMapping("/all")
    @LoadBalanced
    public ResponseEntity<List<IpoDTO>> getAllIPOs() {
        List<IpoDTO> list = ipoService.getAllIPO();
        return ResponseEntity.status(HttpStatus.FOUND).body(list);
    }
}
