package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SeatHandle {

	@Value("AWee")
	private String brand;
	@Value("405.0")
	private double price;
	@Value("iron")
	private String meterial;

	@Override
	public String toString() {
		return "SeatHandle [brand=" + brand + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
