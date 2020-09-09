package com.nimble00.stockmarketservice.repository;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.stockmarket.company2.models.StockExchange;
import com.stockmarket.company2.repository.StockExchangeRepo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class StockExchangeRepoTest {

    @Autowired
    private StockExchangeRepo stockExchangeRepo;

    @Test
    public void testFindAll() {
        List<StockExchange> stockExchangeList = stockExchangeRepo.findAll();
        assertEquals(3,stockExchangeList.size());
    }

    @Test
    public void testFindOne() {
        StockExchange stockExchange = stockExchangeRepo.findById(10001).get();
        assertEquals("NYSE",stockExchange.getName());
    }
}
