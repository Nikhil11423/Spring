package com.xworkz.springframework.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springfw")
@Component
@Getter
@Setter
public class CustomerBean {
	private String name, id, address1, address2, email, gender, qualification;
	private float height, weight;
	private int age, birthYear;
	private boolean married;
	private long ph_no;

	@Value("SowmyaKushi")
	public void setName(String name) {
		this.name = name;
	}

	@Value("S156")
	public void setId(String id) {
		this.id = id;
	}

	@Value("bng")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Value("dvg")
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Value("sow@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	@Value("female")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Value("BE")
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Value("5.2")
	public void setHeight(float height) {
		this.height = height;
	}

	@Value("38")
	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Value("24")
	public void setAge(int age) {
		this.age = age;
	}

	@Value("1998")
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Value("false")
	public void setMarried(boolean married) {
		this.married = married;
	}

	@Value("7894561230")
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}

	@Override
	public String toString() {
		return "CustomerBean [name=" + name + ", id=" + id + ", address1=" + address1 + ", address2=" + address2
				+ ", email=" + email + ", gender=" + gender + ", qualification=" + qualification + ", height=" + height
				+ ", weight=" + weight + ", age=" + age + ", birthYear=" + birthYear + ", married=" + married
				+ ", ph_no=" + ph_no + "]";
	}

}

