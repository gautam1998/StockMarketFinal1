package com.stockmarket.company2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.stockmarket.company2.models.Ticker;

@Repository
public interface TickerRepo extends JpaRepository<Ticker, Integer> {

}