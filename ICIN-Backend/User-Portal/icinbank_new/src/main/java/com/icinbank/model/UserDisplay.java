package com.icinbank.model;

public class UserDisplay {
	String username;
	private long primaryAccno;
	private int primaryBalance;
	private long savingsAccno;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPrimaryAccno() {
		return primaryAccno;
	}
	public void setPrimaryAccno(long primaryAccno) {
		this.primaryAccno = primaryAccno;
	}
	public int getPrimaryBalance() {
		return primaryBalance;
	}
	public void setPrimaryBalance(int primaryBalance) {
		this.primaryBalance = primaryBalance;
	}
	public long getSavingsAccno() {
		return savingsAccno;
	}
	public void setSavingsAccno(long savingsAccno) {
		this.savingsAccno = savingsAccno;
	}
	public int getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(int savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	private int savingsBalance;
	public UserDisplay(String username, long primaryAccno, int primaryBalance, long savingsAccno, int savingsBalance) {
		super();
		this.username = username;
		this.primaryAccno = primaryAccno;
		this.primaryBalance = primaryBalance;
		this.savingsAccno = savingsAccno;
		this.savingsBalance = savingsBalance;
	}
	
	public UserDisplay() {
		// TODO Auto-generated constructor stub
	}
	
}
