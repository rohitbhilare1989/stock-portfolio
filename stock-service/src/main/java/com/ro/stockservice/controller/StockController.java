package com.ro.stockservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ro.stockservice.dto.StockTradeDetailsResponse;
import com.ro.stockservice.service.StockTradeDetailsService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "Stock & Trade", description = "Stock & Trade management APIs")
@RestController
@RequestMapping("/api/v1/stocks")
@RequiredArgsConstructor
public class StockController {

	private final StockTradeDetailsService stockTradeDetailsService;
	
	@GetMapping("/status")
	public String getStockServiceStatus() {
		return "Stock service is up!";
	}

	@GetMapping
	public List<StockTradeDetailsResponse> getAllStockTradeDetails() {
		return stockTradeDetailsService.getAllStockTradeDetails();
	}

}
