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
	public class ActorBean {
		private String name, gender, address, qualification;
		private boolean married, lover;
		private int id, birthYear, height, weight, age, noOfKids, noOfAwards, noOfMovies;

		@Value("Nikhil")
		public void setName(String name) {
			this.name = name;
		}

		@Value("male")
		public void setGender(String gender) {
			this.gender = gender;
		}

		@Value("bangalore")
		public void setAddress(String address) {
			this.address = address;
		}

		@Value("BE")
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		@Value("false")
		public void setMarried(boolean married) {
			this.married = married;
		}

		@Value("false")
		public void setLover(boolean lover) {
			this.lover = lover;
		}

		@Value("123")
		public void setId(int id) {
			this.id = id;
		}

		@Value("1998")
		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}

		@Value("5")
		public void setHeight(int height) {
			this.height = height;
		}

		@Value("40")
		public void setWeight(int weight) {
			this.weight = weight;
		}

		@Value("24")
		public void setAge(int age) {
			this.age = age;
		}

		@Value("00")
		public void setNoOfKids(int noOfKids) {
			this.noOfKids = noOfKids;
		}

		@Value("25")
		public void setNoOfAwards(int noOfAwards) {
			this.noOfAwards = noOfAwards;
		}

		@Value("20")
		public void setNoOfMovies(int noOfMovies) {
			this.noOfMovies = noOfMovies;
		}

		@Override
		public String toString() {
			return "ActorBean [name=" + name + ", gender=" + gender + ", address=" + address + ", qualification="
					+ qualification + ", married=" + married + ", lover=" + lover + ", id=" + id + ", birthYear="
					+ birthYear + ", height=" + height + ", weight=" + weight + ", age=" + age + ", noOfKids=" + noOfKids
					+ ", noOfAwards=" + noOfAwards + ", noOfMovies=" + noOfMovies + "]";
		}

	}


