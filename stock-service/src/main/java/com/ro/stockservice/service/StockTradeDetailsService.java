package com.ro.stockservice.service;

import java.util.List;

import com.ro.stockservice.dto.StockTradeDetailsResponse;

public interface StockTradeDetailsService {
	public List<StockTradeDetailsResponse> getAllStockTradeDetails();
}
