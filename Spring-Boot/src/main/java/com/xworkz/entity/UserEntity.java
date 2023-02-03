package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity(name = "boot")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "owner", nullable = false)
	private String owner;

	@Column(name = "entryfee", nullable = false)
	private int entryfee;

	public UserEntity() {
		super();
	}

	
	public UserEntity(int userId, String name, String location, String owner, int entryfee) {
		super();
		this.userId = userId;
		this.name = name;
		this.location = location;
		this.owner = owner;
		this.entryfee = entryfee;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getEntryfee() {
		return entryfee;
	}

	public void setEntryfee(int entryfee) {
		this.entryfee = entryfee;
	}

}

