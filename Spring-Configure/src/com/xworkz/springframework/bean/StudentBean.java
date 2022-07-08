package com.xworkz.springframework.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springframework")
	@Component
	@Getter
	@Setter
	public class StudentBean {
		
		private String id;
		private int age;
		private long phoNo;
		private String name;
		private float height;
		private String email;
		private String address;
		private float weight;
		private String qualification;
		private String motherName;
		private String fatherName;
		private String color;
		private boolean lover;
		private boolean crush;
		
		@Value("CS181012")
		public void setId(String id) {
			this.id = id;
		}
		@Value("27")
		public void setAge(int age) {
			this.age = age;
		}
		@Value("7204750578")
		public void setPhoNo(long phoNo) {
			this.phoNo = phoNo;
		}
		@Value("Nikhil")
		public void setName(String name) {
			this.name = name;
		}
		@Value("5.7")
		public void setHeight(float height) {
			this.height = height;
		}
		@Value("nikhilb@gmail.com")
		public void setEmail(String email) {
			this.email = email;
		}
		@Value("Borgaon")
		public void setAddress(String address) {
			this.address = address;
		}
		@Value("72")
		public void setWeight(float weight) {
			this.weight = weight;
		}
		@Value("MSc C.S")
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		@Value("Latika")
		public void setMotherName(String motherName) {
			this.motherName = motherName;
		}
		@Value("Raju")
		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}
		@Value("Yellow")
		public void setColor(String color) {
			this.color = color;
		}
		@Value("false")
		public void setLover(boolean lover) {
			this.lover = lover;
		}
		@Value("false")
		public void setCrush(boolean crush) {
			this.crush = crush;
		}
		@Override
		public String toString() {
			return "StudentBean [id=" + id + ", age=" + age + ", phoNo=" + phoNo + ", name=" + name + ", height=" + height
					+ ", email=" + email + ", address=" + address + ", weight=" + weight + ", qualification="
					+ qualification + ", motherName=" + motherName + ", fatherName=" + fatherName + ", color=" + color
					+ ", lover=" + lover + ", crush=" + crush + "]";
		}
		
		


	}


