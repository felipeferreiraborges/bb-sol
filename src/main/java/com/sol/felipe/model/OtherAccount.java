package com.sol.felipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherAccount
{
    private String id;
    private Holder holder;
    private String number;
    private String kind;
    @JsonProperty("IBAN")
    private String iBAN;
    private Object swift_bic;
    private Bank bank;
    private Metadata metadata;
	public OtherAccount() {
		
	}
	public OtherAccount(String id, Holder holder, String number, String kind, String iBAN, Object swift_bic, Bank bank,
			Metadata metadata) {
		super();
		this.id = id;
		this.holder = holder;
		this.number = number;
		this.kind = kind;
		this.iBAN = iBAN;
		this.swift_bic = swift_bic;
		this.bank = bank;
		this.metadata = metadata;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Holder getHolder() {
		return holder;
	}
	public void setHolder(Holder holder) {
		this.holder = holder;
	}
	@JsonProperty("counterpartyAccount")
	public String getNumber() {
		return number;
	}
	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getiBAN() {
		return iBAN;
	}
	public void setiBAN(String iBAN) {
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
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	
	
    
    
}