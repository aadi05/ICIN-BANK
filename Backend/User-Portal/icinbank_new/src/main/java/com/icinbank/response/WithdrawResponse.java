package com.icinbank.response;

public class WithdrawResponse {

	private boolean withdrawStatus;
	private String responseMessage;
	private long account;
	
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
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	

	
}
