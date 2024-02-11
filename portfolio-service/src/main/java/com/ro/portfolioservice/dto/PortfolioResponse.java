package com.ro.portfolioservice.dto;

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
public class PortfolioResponse {
	private int userId;
	private String stockCode;	

	@JsonIgnore
	private Date createdDate;
}
