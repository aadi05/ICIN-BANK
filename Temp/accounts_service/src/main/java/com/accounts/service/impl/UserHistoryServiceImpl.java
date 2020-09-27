package com.accounts.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.dao.UserHistoryRepository;
import com.accounts.model.UserHistory;
import com.accounts.service.UserHistoryService;

@Service
public class UserHistoryServiceImpl implements UserHistoryService {
	
	@Autowired
	private UserHistoryRepository dao;

	@Override
	public UserHistory addAction(int account, int amount, int balance, String action) {
		LocalDate today = LocalDate.now();
		
		UserHistory row=new UserHistory();
		row.setAccount(account);
		row.setAction(action);
		row.setAmount(amount);
		row.setDate(today);
		return dao.save(row);
	}

	@Override
	public List<UserHistory> getHistory(int account) {
		// TODO Auto-generated method stub
		return dao.findByAccount(account);
	}

}
