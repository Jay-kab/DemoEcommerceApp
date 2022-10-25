package com.qa;

public class User1Ethnicity {
	int id;
	String name;
	String gender;
	int age;
	String ethnicity;

	public User1Ethnicity(int id, String name, String gender, int age, String ethnicity) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.ethnicity = ethnicity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

}
