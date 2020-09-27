package com.icinbank.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long account;
	private int amount;
	private String action;
	private LocalDate date;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate today) {
		this.date = today;
	}
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
}
