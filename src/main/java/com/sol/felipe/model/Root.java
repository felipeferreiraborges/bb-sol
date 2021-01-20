package com.sol.felipe.model;

import java.util.List;

public class Root{
    private List<Transaction> transactions;

    public Root() {
    	
    }
	public Root(List<Transaction> transactions) {
		super();
		this.transactions = transactions;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
    
    
}
