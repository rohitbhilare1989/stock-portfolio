package com.ro.portfolioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ro.portfolioservice.model.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {
	public Portfolio findByStockCodeAndUserId(String stockCode, int userId);
	public void deleteByUserId(int userId);
}
