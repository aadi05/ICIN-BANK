package com.accounts.service;
import com.accounts.response.DepositResponse;
import com.accounts.response.TransferResponse;
import com.accounts.response.WithdrawResponse;

public interface AccountService {

	//public Account newAccount(String username);
	public DepositResponse deposit(int acc,int amount);
	public WithdrawResponse withdraw(int acc,int amount);
	public TransferResponse transfer(int saccount,int raccount,int amount);
}
