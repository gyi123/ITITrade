package com.zzyy.service.impl;

import com.zzyy.data.dao.UserDao;
import com.zzyy.data.domain.User;
import com.zzyy.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao dao;
    public UserServiceImpl(UserDao dao) {
	this.dao = dao;
    }
    @Override
    public User getUser(String userName) {
	
	return dao.getUserByName(userName);
    }

}
