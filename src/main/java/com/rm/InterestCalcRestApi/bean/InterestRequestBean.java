package com.rm.InterestCalcRestApi.bean;

import java.time.LocalDate;

public class InterestRequestBean {

	private Double principal;
	
	private LocalDate fromDate;
	
	private LocalDate toDate;
	
	private Double rate;
	
	private Double interestAmount;
	
	private Double totalAmount;

	public InterestRequestBean() {
		super();
	}

	public InterestRequestBean(Double principal, LocalDate fromDate, LocalDate toDate, Double rate,
			Double interestAmount, Double totalAmount) {
		super();
		this.principal = principal;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.rate = rate;
		this.interestAmount = interestAmount;
		this.totalAmount = totalAmount;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(Double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "InterestRequestBean [principal=" + principal + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", rate=" + rate + ", interestAmount=" + interestAmount + ", totalAmount=" + totalAmount + "]";
	}
}
