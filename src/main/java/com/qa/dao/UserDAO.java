package com.qa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.qa.User;
import com.qa.db.DBUtils;

public class UserDAO {

	public void ecommerceAppUsers(User user) throws Exception {

		Connection conn = DBUtils.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("insert into ecommerce_registration values (?, ?, ?, ?, ?)");
		
		
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getFirstName());
		pstmt.setString(4, user.getLastName());
		pstmt.setString(5, user.getEmail());

		
		pstmt.execute();
	}

	public boolean loginSuccess(String username, String password) throws Exception {

		boolean loginSuccess = false;
		
		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from ecommerce_registration where username = ? and password = ?");
		
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			loginSuccess = true;
		}
		return loginSuccess;
	}
	
	public User loginNextPage(String username, String password) throws Exception {

		User user = null;

		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from ecommerce_registration where username = ? and password = ?");

		pstmt.setString(1, username);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();

		if(rs.next()) {
			String username1 = rs.getString(1);
			String password1 = rs.getString(2);
			String firstName = rs.getString(3);
			String lastName = rs.getString(4);
			String email = rs.getString(4);

			user = new User(username, password, firstName, lastName, email);
		}
		return user;
	
	}
	
	public User getUser(String username, String password) throws Exception {

		Connection conn = DBUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement("select * from ecommerce_registration where username = ? and password = ?");

		pstmt.setString(1, username);
		pstmt.setString(2, password);

		ResultSet rs = pstmt.executeQuery();
		
		User user = null;

		if(rs.next()) {
			String username1 = rs.getString(1);
			String password1 = rs.getString(2);
			String firstName = rs.getString(3);
			String lastName = rs.getString(4);
			String email = rs.getString(4);

			user = new User(username, password, firstName, lastName, email);
		}
		return user;
	}


	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public List<User> getAllUsers() throws Exception {
//
//		Connection conn = DBUtils.getConnection();
//
//		PreparedStatement pstmt = conn.prepareStatement("select * from e_commerce registration");
//
//		List<User> users = new ArrayList<User>();
//
//		ResultSet rs = pstmt.executeQuery();
//
//		while (rs.next()) {
//
//			String firstName = rs.getString(1);
//			String lastName = rs.getString(2);
//			String email = rs.getString(3);
//
//			User user = new User(firstName, lastName, email);
//
//			users.add(user);
//		}
//
//		return users;
//
//	}

