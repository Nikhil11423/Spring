package com.xworkz.register.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "login")
@NamedQuery(name = "getAllUserInfo",query = "from ProfileEntity")
@NamedQueries({ 
	@NamedQuery(name = "findByEmailId", query = "Select prof from ProfileEntity prof where prof.emailId=:us"),
	@NamedQuery(name = "findByEmailIdAndPassword", query = "Select prof from ProfileEntity prof where prof.emailId=:us And prof.password=:pass"),
	@NamedQuery(name = "deleteById",query = "DELETE from ProfileEntity prof where prof.id=:i")
	
})
@Entity
public class ProfileEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String photo;
	private String emailId;
	private String password;
	private Long mobileNo;
	private String  dob;

	public ProfileEntity(int id, String name, String photo, String emailId, String password, long mobileNo, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}

	public ProfileEntity() {

	}


}



