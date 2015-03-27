package com.keitsen.mvcproject.service.system.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.keitsen.mvcproject.dao.system.IAccountDao;
import com.keitsen.mvcproject.model.system.Account;
import com.keitsen.mvcproject.service.system.IAccountService;


@Service(IAccountService.SERVICE_NAME)
public class AccountServiceImpl implements IAccountService {
	
	@Resource(name=IAccountDao.DAO_NAME)
	private IAccountDao accountDao;

	public void saveAccount(Account account) {
		accountDao.insertAccount(account);
	}
	
	

}
