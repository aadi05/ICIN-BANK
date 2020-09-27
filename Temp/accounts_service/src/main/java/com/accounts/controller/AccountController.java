package com.accounts.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.model.TransactionDetails;
import com.accounts.model.Transfer;
import com.accounts.model.TransferDetails;
import com.accounts.model.UserHistory;
import com.accounts.response.DepositResponse;
import com.accounts.response.TransferResponse;
import com.accounts.response.WithdrawResponse;
import com.accounts.service.AccountService;
import com.accounts.service.TransferHistoryService;
import com.accounts.service.UserHistoryService;

@RestController
public class AccountController {

	@Autowired
	private AccountService service;
	
	@Autowired
	private UserHistoryService hservice;
	
	@Autowired
	private TransferHistoryService tservice;
	
	@PostMapping("/deposit")
	public DepositResponse deposit(@RequestBody TransactionDetails details) {
		return service.deposit(details.getAccount(), details.getAmount());
	}

	@PostMapping("/withdraw")
	public WithdrawResponse withdraw(@RequestBody TransactionDetails details) {
		return service.withdraw(details.getAccount(), details.getAmount());
	}

	@PostMapping("/transfer")
	public TransferResponse transfer(@RequestBody TransferDetails details) {
		return service.transfer(details.getSaccount(), details.getRaccount(), details.getAmount());
	}
	
	@GetMapping("/getHistory/{account}")
	public List<UserHistory> getHistory(@PathVariable("account") int account )
	{
		List<UserHistory> history=hservice.getHistory(account);
		Collections.reverse(history);
		return history;
	}
	
	@GetMapping("/getTransfers/{account}")
	public List<Transfer> getTransfers(@PathVariable("account") long account )
	{
		return tservice.getTransfers(account);
	}
}
