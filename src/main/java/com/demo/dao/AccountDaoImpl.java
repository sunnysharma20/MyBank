package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.demo.dao.AccountDao;
import com.demo.model.Account;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Account> getAllAccounts() {
		String sql = "SELECT * FROM account";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Account> result = new ArrayList<Account>();
		for (Map<String, Object> row : rows) {
			Account acc = new Account();
			acc.setId((Integer) row.get("Id"));
			acc.setName((String) row.get("Name"));
			result.add(acc);
		}

		return result;
	}

	@Override
	public void insertAccount(Account account) {
		String sql = "INSERT INTO account " +
				"(name,address) VALUES ( ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				account.getId(), account.getName()
		});
		
	}
}