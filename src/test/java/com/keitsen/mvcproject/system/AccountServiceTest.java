package com.keitsen.mvcproject.system;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.keitsen.demo.basic.AbstractTestCase;
import com.keitsen.mvcproject.model.system.Account;
import com.keitsen.mvcproject.service.system.IAccountService;

public class AccountServiceTest extends AbstractTestCase{

	@Resource(name=IAccountService.SERVICE_NAME)
	private IAccountService accountService;
	
	
	@Test
	public void testAdd(){
		Account account = new Account();
		account.setLoginName("admin");
		account.setUserName("管理员");
		account.setPassword("123");
		account.setEmail("abc@abc.com");
		account.setCreateDate(new Date());
		account.setState(1);
		
		accountService.saveAccount(account);
	}
	
}
