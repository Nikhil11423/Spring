package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mudguard {

	@Value("Speed-x")
	private String brand;
	@Value("999.0")
	private double price;
	@Value("Polycorbonate")
	private String meterial;

	@Override
	public String toString() {
		return "Mudguard [brand=" + brand + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
