package com.accounts.service;

import java.util.List;

import com.accounts.model.Transfer;

public interface TransferHistoryService {

	public Transfer addAction(int saccount, int raccount, int amount);
	public List<Transfer> getTransfers(long account);
}
