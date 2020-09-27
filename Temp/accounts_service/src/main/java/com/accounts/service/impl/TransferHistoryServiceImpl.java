package com.accounts.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.dao.TransferHistoryRepository;
import com.accounts.model.Transfer;
import com.accounts.service.TransferHistoryService;

@Service
public class TransferHistoryServiceImpl implements TransferHistoryService{

	@Autowired
	private TransferHistoryRepository dao;
	
	@Override
	public Transfer addAction(int saccount, int raccount, int amount) {
		LocalDate today = LocalDate.now();
		Transfer transfer=new Transfer();
		transfer.setSaccount(saccount);
		transfer.setRaccount(raccount);
		transfer.setAmount(amount);
		transfer.setDate(today);
		return dao.save(transfer);
	}

	@Override
	public List<Transfer> getTransfers(long account) {
		List<Transfer> sender=dao.findBySaccount(account);
		List<Transfer> receiver=dao.findByRaccount(account);
		List<Transfer> merged=new ArrayList<>();
		merged.addAll(sender);
		merged.addAll(receiver);
		Collections.sort(merged);
		return merged;
	}

}
