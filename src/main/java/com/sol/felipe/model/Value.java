package com.sol.felipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value
{
    private String currency;
    private String amount;
	public Value() {

	}
	public Value(String currency, String amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	//@JsonProperty("instructedCurrency")
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	//@JsonProperty("instructedAmount")
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
    
}
