package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpeedoMeter {

	@Value("Open throttle racers")
	private String brand;
	@Value("3437.0")
	private double price;
	@Value("300g")
	private String weight;

	@Override
	public String toString() {
		return "SpeedoMeter [brand=" + brand + ", price=" + price + ", weight=" + weight + "]";
	}

}
