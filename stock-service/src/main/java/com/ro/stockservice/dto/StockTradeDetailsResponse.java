package com.ro.stockservice.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockTradeDetailsResponse {
	private int stockCode;
	private String stockName;	
	private float dayOpen;	
	private float dayHigh;	
	private float dayLow;
	private float tradedPrice;
	private float previousClose;
	@JsonIgnore
	private Date tradedDateTime;
}
