package com.ro.portfolioservice.service;

import com.ro.portfolioservice.dto.PortfolioRequest;

public interface PortfolioService {

	// Process request data
	public void createPortfolio(PortfolioRequest portfolioRequest);
	
	public void deletePortfolio(String stockCode, int userId);
	
	public void deletePortfolioByUserId(int userId);
}
