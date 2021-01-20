package com.sol.felipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewBalance
{
    private String currency;
    private String amount;
	public NewBalance() {

	}
	public NewBalance(String currency, String amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	//@JsonProperty("transactionCurrency")
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	//@JsonProperty("transactionAmount")
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
    
}