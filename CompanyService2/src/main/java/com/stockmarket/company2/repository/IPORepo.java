package com.stockmarket.company2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockmarket.company2.models.IPO;

@Repository
public interface IPORepo extends JpaRepository<IPO,Integer> {

}
