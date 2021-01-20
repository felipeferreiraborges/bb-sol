package com.sol.felipe.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThisAccount
{
    private String id;
    private List<Holder> holders;
    private String number;
    private String kind;
    @JsonProperty("IBAN")
    private Object iBAN;
    private Object swift_bic;
    private Bank bank;
    
    public ThisAccount() {
    	
    }
	public ThisAccount(String id, List<Holder> holders, String number, String kind, Object iBAN, Object swift_bic,
			Bank bank) {
		super();
		this.id = id;
		this.holders = holders;
		this.number = number;
		this.kind = kind;
		this.iBAN = iBAN;
		this.swift_bic = swift_bic;
		this.bank = bank;
	}
	//@JsonProperty("accountId")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Holder> getHolders() {
		return holders;
	}
	public void setHolders(List<Holder> holders) {
		this.holders = holders;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Object getiBAN() {
		return iBAN;
	}
	public void setiBAN(Object iBAN) {
		this.iBAN = iBAN;
	}
	public Object getSwift_bic() {
		return swift_bic;
	}
	public void setSwift_bic(Object swift_bic) {
		this.swift_bic = swift_bic;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
    
    
}