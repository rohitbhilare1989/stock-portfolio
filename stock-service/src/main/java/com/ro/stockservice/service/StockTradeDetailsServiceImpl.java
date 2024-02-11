package com.ro.stockservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ro.stockservice.dto.StockTradeDetailsResponse;
import com.ro.stockservice.model.StockTradeDetails;
import com.ro.stockservice.repository.StockTradeDetailsRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class StockTradeDetailsServiceImpl implements StockTradeDetailsService {

	private final StockTradeDetailsRepository stockTradeDetailsRepository;

	public List<StockTradeDetailsResponse> getAllStockTradeDetails() {
		log.info("StockTradeDetails Service Called: getAllStockTradeDetails");
		List<StockTradeDetails> stockTradeDetails = stockTradeDetailsRepository.findAll();

		return stockTradeDetails.stream().map(this::mapToStockTradeDetailsResponse).toList();

	}

	private StockTradeDetailsResponse mapToStockTradeDetailsResponse(StockTradeDetails stockTradeDetails) {
		return StockTradeDetailsResponse.builder().stockCode(stockTradeDetails.getStockCode())
				.stockName(stockTradeDetails.getStockName()).dayOpen(stockTradeDetails.getDayOpen())
				.dayHigh(stockTradeDetails.getDayHigh()).dayLow(stockTradeDetails.getDayLow())
				.tradedPrice(stockTradeDetails.getTradedPrice()).previousClose(stockTradeDetails.getPreviousClose())
				.tradedDateTime(stockTradeDetails.getTradedDateTime()).build();
	}
}
