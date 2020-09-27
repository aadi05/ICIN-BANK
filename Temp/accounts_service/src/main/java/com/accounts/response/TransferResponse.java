package com.accounts.response;

public class TransferResponse {

	private boolean transferStatus;
	private String responseMessage;
	private int saccount;
	public boolean isTransferStatus() {
		return transferStatus;
	}
	public void setTransferStatus(boolean transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public int getSaccount() {
		return saccount;
	}
	public void setSaccount(int saccount) {
		this.saccount = saccount;
	}
	
}
