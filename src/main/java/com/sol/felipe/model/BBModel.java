package com.sol.felipe.model;

public class BBModel {
	private String id;
	private String accountId;
	private String counterPartyAccount;
	private String counterpartyName;
	private String counterPartyLogoPath;
	private String instructedAmount;
	private String innstructedCurrency;
	private String transactionAmount;
	private String transactionCurrency;
	private String transactionType;
	private String description;
	public BBModel() {
		super();
	}
	public BBModel(String id, String accountId, String counterPartyAccount, String counterpartyName,
			String counterPartyLogoPath, String instructedAmount, String innstructedCurrency, String transactionAmount,
			String transactionCurrency, String transactionType, String description) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.counterPartyAccount = counterPartyAccount;
		this.counterpartyName = counterpartyName;
		this.counterPartyLogoPath = counterPartyLogoPath;
		this.instructedAmount = instructedAmount;
		this.innstructedCurrency = innstructedCurrency;
		this.transactionAmount = transactionAmount;
		this.transactionCurrency = transactionCurrency;
		this.transactionType = transactionType;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCounterPartyAccount() {
		return counterPartyAccount;
	}
	public void setCounterPartyAccount(String counterPartyAccount) {
		this.counterPartyAccount = counterPartyAccount;
	}
	public String getCounterpartyName() {
		return counterpartyName;
	}
	public void setCounterpartyName(String counterpartyName) {
		this.counterpartyName = counterpartyName;
	}
	public String getCounterPartyLogoPath() {
		return counterPartyLogoPath;
	}
	public void setCounterPartyLogoPath(String counterPartyLogoPath) {
		this.counterPartyLogoPath = counterPartyLogoPath;
	}
	public String getInstructedAmount() {
		return instructedAmount;
	}
	public void setInstructedAmount(String instructedAmount) {
		this.instructedAmount = instructedAmount;
	}
	public String getInnstructedCurrency() {
		return innstructedCurrency;
	}
	public void setInnstructedCurrency(String innstructedCurrency) {
		this.innstructedCurrency = innstructedCurrency;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionCurrency() {
		return transactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
