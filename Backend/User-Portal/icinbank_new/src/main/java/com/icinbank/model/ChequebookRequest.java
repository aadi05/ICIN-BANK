package com.icinbank.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ChequebookRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long account;
	private String accType;
	private boolean requestStatus;
	private LocalDate date;
	private int no_of_pages;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public boolean isRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(boolean requestStatus) {
		this.requestStatus = requestStatus;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getNo_of_pages() {
		return no_of_pages;
	}
	public void setNo_of_pages(int no_of_pages) {
		this.no_of_pages = no_of_pages;
	}
	
	

}
