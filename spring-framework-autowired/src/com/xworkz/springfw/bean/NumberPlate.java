package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NumberPlate {

	@Value("Innovqaraj")
	private String brand;
	@Value("380.0")
	private double price;
	@Value("alluminium")
	private String meterial;

	@Override
	public String toString() {
		return "NumberPlate [brand=" + brand + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
