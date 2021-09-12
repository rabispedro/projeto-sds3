package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO {

	private Long id;
	
	private Integer visited;
	private Double amount;
	private LocalDate date;

	private SellerDTO seller;

	public SaleDTO(){
	}

	public SaleDTO(Long id, Integer visited, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public SaleDTO(Sale entity){
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.seller = new SellerDTO(entity.getSeller());
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return this.visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return this.seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
}
