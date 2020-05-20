package com.demo.service;

import java.util.List;

import com.demo.model.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	void insertAccount(Account account);
}