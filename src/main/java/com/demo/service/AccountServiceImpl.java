package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AccountDao;
import com.demo.model.Account;
import com.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao accountDao;

	public List<Account> getAllAccounts() {
		List<Account> accounts = accountDao.getAllAccounts();
		return accounts;
	}

	@Override
	public void insertAccount(Account account) {
		accountDao.insertAccount(account);
		
	}

}