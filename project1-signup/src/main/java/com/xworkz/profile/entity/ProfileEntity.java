package com.xworkz.profile.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "nikhil")
@NamedQueries({ @NamedQuery(name = "findByUserId", query = "Select prof from ProfileEntity prof where prof.userId=:us"),
		@NamedQuery(name = "findByUserIdAndPassword", query = "Select prof from ProfileEntity prof where prof.userId=:ni And prof.password=:pass"),
		@NamedQuery(name = "updatePasswordByUserId", query = "update ProfileEntity prof set prof.password=:pass where prof.userId=:us"),
		@NamedQuery(name = "updateProfileEntityByUserId", query = "update ProfileEntity prof set prof.fullName=:fname where prof.userId=:us"),
		@NamedQuery(name = "updateOtpByUserId", query = "update ProfileEntity prof set prof.otp=:tp where prof.userId=:us"),
		@NamedQuery(name = "updateOtpGeneratedTimeByUserId", query = "update ProfileEntity prof set prof.otpGeneratedTime=:otpgt where prof.userId=:us"),
		@NamedQuery(name = "updateloginCountByUserId" , query= "update ProfileEntity prof set prof.loginCount=:log where prof.userId=:us"),
        @NamedQuery(name = "updateOtpByScheduler" , query= "update ProfileEntity set otp=null where otpGeneratedTime<=:otpgt")})

public class ProfileEntity extends ParentEntity {
	@Id
	private int id;
	private String fullName;
	private String userId;
	private String email;
	private String password;
	private String confirmPassword;
	private String otp;
	private Integer loginCount;
	private Boolean activeStatus;
	private LocalDateTime otpGeneratedTime;
	
	//@OneToOne(mappedBy = "nikhil")
	//private PersonalEntity personalEntity;

	public ProfileEntity(String createdBy, LocalDateTime createdDateTime, String updatedBy,
			LocalDateTime updatedDateTime, String fullName, String userId, String email, String password, String confirmPassword, String otp,Integer loginCount, Boolean activeStatus,LocalDateTime otpGeneratedTime) {
		super(createdBy, createdDateTime, updatedBy, updatedDateTime);
		this.fullName = fullName;
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.otp = otp;
		this.loginCount= loginCount;
		this.activeStatus = activeStatus;
		this.otpGeneratedTime = otpGeneratedTime;
	}

}
