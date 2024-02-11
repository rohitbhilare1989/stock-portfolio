package com.ro.stockservice.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class StockTradeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
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
