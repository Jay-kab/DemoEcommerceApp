package com.qa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {

	@RequestMapping("/message")
	public String getMessage() {
		return "Hello, I'm learning SpringBoot!!";

	}

	@RequestMapping("/weatherToday")
	public String getWeather() {
		return "The weather today is bright with clear skies..Enjoy!";
	}

	@RequestMapping("/getUser")
	public User1Ethnicity getUserInfo() {
		return new User1Ethnicity(1, "Jay", "Female", 19, "Carribean");

	}

	@RequestMapping("/getUsers")
	public List<User1Ethnicity> getMultipleUserDetails() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root",
				"Chineme01");

		PreparedStatement pstmt = conn.prepareStatement("select * from cohort_members");

		ResultSet rs = pstmt.executeQuery();
		
		List<User1Ethnicity> users= new ArrayList<User1Ethnicity>();
		
		while (rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String gender = rs.getString(3);
			int age = rs.getInt(4);
			String ethnicity = rs.getString(5);
			
			User1Ethnicity user = new User1Ethnicity(id, name, gender, age, ethnicity);
			
			users.add(user);
		
		}
		return users;

	}
}
