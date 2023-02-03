package com.xworkz.freedom.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "freedomfighter")
@NamedQueries(@NamedQuery(name = "findByName", query = "select freedom from FreedomFighterEntity freedom where freedom.name=:nm"))
public class FreedomFighterEntity extends PropertiesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private LocalDate birthDate;
	private LocalDate deathDate;
	private String gender;

	public FreedomFighterEntity(String createdBy, LocalDateTime createDateTime, String updatedBy,
			LocalDateTime updateDateTime, String name, String location, LocalDate birthDate, LocalDate deathDate,
			String gender) {
		super(createdBy, createDateTime, updatedBy, updateDateTime);

		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.gender = gender;

	}

	@Override
	public String toString() {
		return "FreedomFighterEntity [id=" + id + ", name=" + name + ", location=" + location + ", birthDate="
				+ birthDate + ", deathDate=" + deathDate + ", gender=" + gender + ", CreatedBy=" + getCreatedBy()
				+ ", CreateDateTime=" + getCreateDateTime() + ", UpdatedBy=" + getUpdatedBy() + ", UpdateDateTime="
				+ getUpdateDateTime() + "]";
	}

}