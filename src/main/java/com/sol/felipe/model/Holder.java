package com.sol.felipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Holder
{
    private String name;
    private boolean is_alias;
    public Holder() {
    	
    }
	public Holder(String name, boolean is_alias) {
		super();
		this.name = name;
		this.is_alias = is_alias;
	}
	//@JsonProperty("counterpartyName")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIs_alias() {
		return is_alias;
	}
	public void setIs_alias(boolean is_alias) {
		this.is_alias = is_alias;
	}
	
    
    
    
}