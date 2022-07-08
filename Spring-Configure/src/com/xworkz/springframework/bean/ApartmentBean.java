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
public class ApartmentBean {
	private String name, id, address, email, ownerName, color;
	private long ph_no;
	private int noOfRooms, noOfACRooms, noOfNonACRooms, noOfWorkers, noOfFloors;
	private boolean dogAllowed, lift;

	@Value("Kushi")
	public void setName(String name) {
		this.name = name;
	}

	@Value("kush15")
	public void setId(String id) {
		this.id = id;
	}

	@Value("bangalore")
	public void setAddress(String address) {
		this.address = address;
	}

	@Value("kush@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	@Value("Sowmya")
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Value("lightPink")
	public void setColor(String color) {
		this.color = color;
	}

	@Value("9202030103")
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}

	@Value("50")
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	@Value("25")
	public void setNoOfACRooms(int noOfACRooms) {
		this.noOfACRooms = noOfACRooms;
	}

	@Value("25")
	public void setNoOfNonACRooms(int noOfNonACRooms) {
		this.noOfNonACRooms = noOfNonACRooms;
	}

	@Value("6")
	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	@Value("15")
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	@Value("true")
	public void setDogAllowed(boolean dogAllowed) {
		this.dogAllowed = dogAllowed;
	}

	@Value("true")
	public void setLift(boolean lift) {
		this.lift = lift;
	}

	@Override
	public String toString() {
		return "ApartmentBean [name=" + name + ", id=" + id + ", address=" + address + ", email=" + email
				+ ", ownerName=" + ownerName + ", color=" + color + ", ph_no=" + ph_no + ", noOfRooms=" + noOfRooms
				+ ", noOfACRooms=" + noOfACRooms + ", noOfNonACRooms=" + noOfNonACRooms + ", noOfWorkers=" + noOfWorkers
				+ ", noOfFloors=" + noOfFloors + ", dogAllowed=" + dogAllowed + ", lift=" + lift + "]";
	}


}

