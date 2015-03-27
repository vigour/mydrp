package com.keitsen.mvcproject.service.system;

import com.keitsen.mvcproject.model.system.Account;

/**
 * 用户帐户Service接口
 * @author gxm
 *
 */
public interface IAccountService {

	static final String SERVICE_NAME = "accountService";
	
	void saveAccount(Account account);
}
