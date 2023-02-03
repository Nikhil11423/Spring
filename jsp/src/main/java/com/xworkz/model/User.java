package com.xworkz.model;

import java.util.Date;


public class User {
	
	private int id;
	private String name;
	private String photo;
	private String emailId;
	private String password;
	private long mobileNo;
	
	public User(String name, String photo, String emailId,String password,long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
		
	}
	
	
	public User( String photo, String emailId, String password, long mobileNo) {
		super();
		this.photo = photo;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
		
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
}
