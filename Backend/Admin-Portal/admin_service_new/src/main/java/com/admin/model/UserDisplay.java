package com.admin.model;

public class UserDisplay {
	
	private String fname;
	private String lname;
	private long phone;
	private String username;
	private boolean status;
	private int featureStatus;
	private long primaryAccno;
	private int primaryBalance;
	private long savingsAccno;
	private int savingsBalance;
	
	public UserDisplay() {
		
	}

	public UserDisplay(String fname, String lname, long phone, String username, boolean status, int featureStatus, long primaryAccno,
			int primaryBalance, long savingsAccno, int savingsBalance) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.username = username;
		this.status = status;
		this.featureStatus = featureStatus;
		this.primaryAccno = primaryAccno;
		this.primaryBalance = primaryBalance;
		this.savingsAccno = savingsAccno;
		this.savingsBalance = savingsBalance;
	}



	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
	
	public int getFeatureStatus() {
		return featureStatus;
	}

	public void setFeatureStatus(int featureStatus) {
		this.featureStatus = featureStatus;
	}
	
	
	
}
