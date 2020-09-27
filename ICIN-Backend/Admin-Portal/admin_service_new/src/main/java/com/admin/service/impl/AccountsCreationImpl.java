package com.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.AccountRepository;
import com.admin.dao.UserRepository;
import com.admin.model.Account;

@Service
public class AccountsCreationImpl {
	
	@Autowired
	AccountRepository dao;
	
	@Autowired
	private UserRepository udao;
	
	private final String bankCode = "3914";
	private final String countryCode = "91";
	private final String branchCode = "820";
	private final String accountcode="1";
	
	public Account newAccount(String username,int userId) {
		Account account=new Account();
		account.setUsername(username);
		account.setAccno(generate_saving(userId));
		account.setUser(udao.findByUsername(username));
		return dao.save(account);

	}

	public long generate_saving(int userId) {
		String accNo = bankCode+countryCode+branchCode+accountcode+String.valueOf(userId);
		return Long.parseLong(accNo);
	}

}
