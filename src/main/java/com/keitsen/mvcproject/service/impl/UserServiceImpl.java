package com.keitsen.mvcproject.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.keitsen.mvcproject.dao.IUserDao;
import com.keitsen.mvcproject.model.User;
import com.keitsen.mvcproject.service.IUserService;

@Service(IUserService.SERVICE_NAME)
public class UserServiceImpl implements IUserService {
	
	@Resource(name=IUserDao.DAO_NAME)
	private IUserDao userDao;
	
	public void saveUser(User user) {
		this.userDao.insertUser(user);
	}

}
