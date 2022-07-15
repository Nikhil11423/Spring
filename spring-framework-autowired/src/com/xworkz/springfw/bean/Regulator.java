package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Regulator {

	@Value("Henan Duouchan")
	private String brand;
	@Value("3899.0")
	private double price;
	@Value("brass,plastic,aluminum")
	private String meterial;

	@Override
	public String toString() {
		return "Regulator [brand=" + brand + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
