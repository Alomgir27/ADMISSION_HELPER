package com.example.demo.web.dto;

public class UserRegistrationDto {

	private Long roll;
	private String registration_number;
	private String name;
	private String userName;
	private String email;
	private String password;
	
	public UserRegistrationDto(){
		
	}
	public UserRegistrationDto(Long roll, String registration_number, String name, String userName, String email, String password) {
		super();
		this.roll = roll;
		this.registration_number = registration_number;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		System.out.println("5");

	}
	public Long getRoll() {
		return roll;
	}

	public void setRoll(Long roll) {
		this.roll = roll;
	}

	public String getRegistrationNumber() {
		return registration_number;
	}

	public void setRegistrationNumber(String registration_number) {
		this.registration_number = registration_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}