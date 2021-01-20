package com.sol.felipe.model;



public class Bank
{
    private String national_identifier;
    private String name;
    
    public Bank() {
    	
    }
	public Bank(String national_identifier, String name) {
		super();
		this.national_identifier = national_identifier;
		this.name = name;
	}
	public String getNational_identifier() {
		return national_identifier;
	}
	public void setNational_identifier(String national_identifier) {
		this.national_identifier = national_identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
