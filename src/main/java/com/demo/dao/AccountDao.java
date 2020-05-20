package com.demo.dao;

import java.util.List;

import com.demo.model.Account;;

public interface AccountDao {
	List<Account> getAllAccounts();

	void insertAccount(Account account);
}