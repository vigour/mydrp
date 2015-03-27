package com.keitsen.mvcproject.dao.system;

import org.springframework.stereotype.Repository;

import com.keitsen.mvcproject.model.system.Account;

@Repository(IAccountDao.DAO_NAME)
public interface IAccountDao {
	
	static final String DAO_NAME = "accountDao";
	
	void insertAccount(Account account);
}
