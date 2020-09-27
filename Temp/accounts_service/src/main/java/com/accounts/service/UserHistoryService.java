package com.accounts.service;

import java.util.List;

import com.accounts.model.UserHistory;

public interface UserHistoryService {

	public UserHistory addAction(int account,int amount,int balance,String action);
	public List<UserHistory> getHistory(int account);
}
