package com.xworkz.profile.personal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@Entity
@NoArgsConstructor
@Table(name ="personal")
public class PersonalEntity{

	@Id
	private int id;
	private String firstName;
	private String middelName;
	private String lastName;
	private String motherName;
	private String gender;
	private String marialStatus;
	private Long mobileNo;

//	@OneToOne
//    @JoinColumn(name = "id_nikhil")
//	private ProfileEntity profileEntity;
	
	public PersonalEntity(int id, String firstName, String middelName, String lastName, String motherName,
			String gender, String marialStatus, Long mobileNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middelName = middelName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.gender = gender;
		this.marialStatus = marialStatus;
		this.mobileNo = mobileNo;
	}

}
