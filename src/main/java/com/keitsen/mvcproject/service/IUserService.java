package com.keitsen.mvcproject.service;

import com.keitsen.mvcproject.model.User;

public interface IUserService {

	static final String SERVICE_NAME = "userService";
	
	void saveUser(User user);
}
