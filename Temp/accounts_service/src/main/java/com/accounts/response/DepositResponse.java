package com.accounts.response;

public class DepositResponse {

	private boolean depositStatus;
	private String responseMessage;
	private int account;
	public boolean isDepositStatus() {
		return depositStatus;
	}
	public void setDepositStatus(boolean depositStatus) {
		this.depositStatus = depositStatus;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
}
