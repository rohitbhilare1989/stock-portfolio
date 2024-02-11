package com.ro.portfolioservice.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.ro.portfolioservice.dto.PortfolioRequest;
import com.ro.portfolioservice.model.Portfolio;
import com.ro.portfolioservice.repository.PortfolioRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PortfolioServiceImpl implements PortfolioService {

	private final PortfolioRepository portfolioRepository;

	public void createPortfolio(PortfolioRequest portfolioRequest) {
		log.info("Portfolio Service Called: createPortfolio");
		Portfolio portfolio = Portfolio.builder().userId(portfolioRequest.getUserId())
				.stockCode(portfolioRequest.getStockCode()).createdDate(new Date()).build();
		portfolioRepository.save(portfolio);
		log.info("Portfolio Service Success: record fetched");
	}
	
	public void deletePortfolio(String stockCode, int userId){
		log.info("Portfolio Service Called: deletePortfolio");
		Portfolio portfolio = portfolioRepository.findByStockCodeAndUserId(stockCode, userId);
		portfolioRepository.deleteById(portfolio.getId());
		log.info("Portfolio Service Success: record deleted");
	}
	
	public void deletePortfolioByUserId(int userId) {
		log.info("Portfolio Service Called: deletePortfolioByUserId");
		portfolioRepository.deleteByUserId(userId);
		log.info("Portfolio Service Success: user portfolio deleted");
	}
}
