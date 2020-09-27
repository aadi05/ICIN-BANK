package com.accounts.model;

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
	private int account;
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
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
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
