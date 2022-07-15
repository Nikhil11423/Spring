package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Indicator {

	@Value("ramanatha")
	private String brand;
	@Value("399.0")
	private double price;
	@Value("black")
	private String color;

	@Override
	public String toString() {
		return "Indicator [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

}
