package com.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.SaccountRepository;
import com.admin.dao.UserRepository;
import com.admin.model.Saccount;

@Service
public class SaccountCreationImpl {
	
	@Autowired
	SaccountRepository dao;
	
	@Autowired
	UserRepository udao;
	
	private final String bankCode = "3914";
	private final String countryCode = "91";
	private final String branchCode = "820";
	private final String accountcode="2";
	
	public long generate_saving(int userId) {
		String accNo = bankCode+countryCode+branchCode+accountcode+String.valueOf(userId);
		return Long.parseLong(accNo);
	}

	public Saccount newAccount(String username, int userId) {
		Saccount account =new Saccount();
		account.setUsername(username);
		account.setAccno(generate_saving(userId));
		account.setUser(udao.findByUsername(username));
		return dao.save(account);
	}

}
