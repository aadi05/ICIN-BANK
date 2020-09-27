package com.icinbank.service;

import com.icinbank.model.Saccount;
import com.icinbank.response.DepositResponse;
import com.icinbank.response.TransferResponse;
import com.icinbank.response.WithdrawResponse;

public interface SaccountService {
	public Saccount getAccountDetails(long account);
	public Saccount getAccount(String username);
	public Saccount newAccount(String username,int userId);
	public DepositResponse deposit(long acc,int amount);
	public WithdrawResponse withdraw(long acc,int amount);
	public TransferResponse transfer(long saccount,long raccount,int amount);
}

