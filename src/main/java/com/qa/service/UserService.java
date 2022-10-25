package com.qa.service;

import com.qa.User;
import com.qa.dao.UserDAO;

public class UserService {


public void saveUsersInfo (User user) throws Exception {
	
	UserDAO userDao = new UserDAO();
	
	userDao.ecommerceAppUsers(user);
	
}

public User login(String username, String password) throws Exception {
	
	UserDAO userDao = new UserDAO();
	
	User user = userDao.loginNextPage(username, password);
	
	return user;
}

public User getUser(String username, String password) throws Exception {

	UserDAO userDao = new UserDAO();

	User user = userDao.getUser(username, password);

	return user;
}



}
