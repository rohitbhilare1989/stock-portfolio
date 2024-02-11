package com.ro.portfolioservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ro.portfolioservice.dto.PortfolioRequest;
import com.ro.portfolioservice.service.PortfolioService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "Portfolio", description = "Portfolio management APIs")
@RestController
@RequestMapping("/api/v1/portfolios")
@RequiredArgsConstructor
public class PortfolioController {

	private final PortfolioService portfolioService;

	@GetMapping("/status")
	public String getPortfolioServiceStatus() {
		return "Portfolio service is up!";
	}

	@PostMapping
	public ResponseEntity<String> createPortfolio(@RequestBody PortfolioRequest portfolioRequest) {

		portfolioService.createPortfolio(portfolioRequest);
		return new ResponseEntity<String>("Stock added to Portfolio!", HttpStatus.CREATED);
	}

	@DeleteMapping("{stockCode}")
	public ResponseEntity<String> deletePortfolio(@PathVariable("stockCode") String stockCode) {
		portfolioService.deletePortfolio(stockCode, 1);
		return new ResponseEntity<String>("Stock removed from Portfolio!", HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<String> deletePortfolioByUserId() {
		portfolioService.deletePortfolioByUserId(1);
		return new ResponseEntity<String>("User Portfolio deleted!", HttpStatus.OK);
	}

}
