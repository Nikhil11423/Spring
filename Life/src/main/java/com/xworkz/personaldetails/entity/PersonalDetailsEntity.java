package com.xworkz.personaldetails.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "details")

public class PersonalDetailsEntity  {
	@Id
	
	private int id;
	private String name;
	private String photo;
	private String emailId;
	private String password;
	private String mobileNo;
	private Date dob;
	
	public PersonalDetailsEntity(
			int id, String name, String photo, String emailId, String password, String mobileNo,
			Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}
	
	
	}
	
	
