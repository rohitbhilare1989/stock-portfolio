package com.ro.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ro.stockservice.model.StockTradeDetails;

public interface StockTradeDetailsRepository extends JpaRepository<StockTradeDetails, Integer>{

}
