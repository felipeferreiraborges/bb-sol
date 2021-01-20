package com.sol.felipe.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Details
{
    private String type;
    private String description;
    private Date posted;
    private Date completed;
    private NewBalance new_balance;
    private Value value;
	public Details() {

	}
	public Details(String type, String description, Date posted, Date completed, NewBalance new_balance, Value value) {
		super();
		this.type = type;
		this.description = description;
		this.posted = posted;
		this.completed = completed;
		this.new_balance = new_balance;
		this.value = value;
	}
	@JsonProperty("transactionType")
	public String getType() {
		return type;
	}
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPosted() {
		return posted;
	}
	public void setPosted(Date posted) {
		this.posted = posted;
	}
	public Date getCompleted() {
		return completed;
	}
	public void setCompleted(Date completed) {
		this.completed = completed;
	}
	public NewBalance getNew_balance() {
		return new_balance;
	}
	public void setNew_balance(NewBalance new_balance) {
		this.new_balance = new_balance;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	
    
}