package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HeadLight {

	@Value("otoRoys")
	private String brand;
	@Value("699.0")
	private double price;
	@Value("front")
	private String position;

	@Override
	public String toString() {
		return "HeadLight [brand=" + brand + ", price=" + price + ", position=" + position + "]";
	}

}
