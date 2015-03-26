package com.keitsen.mvcproject;

import javax.annotation.Resource;

import org.junit.Test;

import com.keitsen.demo.basic.AbstractTestCase;
import com.keitsen.mvcproject.model.User;
import com.keitsen.mvcproject.service.IUserService;

public class UserServiceTest extends AbstractTestCase{

	@Resource(name=IUserService.SERVICE_NAME)
	private IUserService userService;
	
	
	@Test
	public void testAdd(){
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123");
		user.setState(1);
		userService.saveUser(user);
	}
}
