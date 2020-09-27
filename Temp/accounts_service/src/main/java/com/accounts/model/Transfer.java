package com.accounts.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Transfer implements Comparable<Transfer>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long saccount;
	private long raccount;
	private int amount;
	private LocalDate date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSaccount() {
		return saccount;
	}
	public void setSaccount(long saccount) {
		this.saccount = saccount;
	}
	public long getRaccount() {
		return raccount;
	}
	public void setRaccount(long raccount) {
		this.raccount = raccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public int compareTo(Transfer o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i2.compareTo(i1);
	}
	
	
}
