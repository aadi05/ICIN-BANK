package com.accounts.response;

public class WithdrawResponse {

	private boolean withdrawStatus;
	private String responseMessage;
	private int account;
	
	public boolean isWithdrawStatus() {
		return withdrawStatus;
	}
	public void setWithdrawStatus(boolean withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
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
