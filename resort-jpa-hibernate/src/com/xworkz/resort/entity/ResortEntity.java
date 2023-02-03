package com.xworkz.resort.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="resort_jpa")
public class ResortEntity implements Serializable {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkInTime")
	private LocalTime checkInTime;
	@Column(name="checkOutTime")
	private LocalTime checkOutTime;
	@Column(name="createdBy")
	private String createdBy;
	@Column(name="createdDate")
	private LocalDate createdDate;
	@Column(name="updatedDate")
	private LocalDate updatedDate;
	@Column(name="ownerName")
	private String ownerName;
	@Column(name="pricePerDay")
	private double pricePerDay;
	
}
