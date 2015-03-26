package com.keitsen.mvcproject.dao;

import org.springframework.stereotype.Repository;

import com.keitsen.mvcproject.model.User;

@Repository(IUserDao.DAO_NAME)
public interface IUserDao {

	static final String DAO_NAME = "userDao";
	void insertUser(User user);
}
