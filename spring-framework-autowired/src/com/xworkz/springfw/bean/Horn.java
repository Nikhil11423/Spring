package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Horn {

	@Value("bosch")
	private String brand;
	@Value("110db")
	private String noiseLevel;
	@Value("205.0")
	private double price;

	@Override
	public String toString() {
		return "Horn [brand=" + brand + ", noiseLevel=" + noiseLevel + ", price=" + price + "]";
	}

}
