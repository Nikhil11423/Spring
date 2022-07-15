package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HandleBarSwitch {

	@Value("uno minda")
	private String brand;
	@Value("404.0")
	private double price;
	@Value("horn")
	private String meterial;

	@Override
	public String toString() {
		return "HandleBarSwitch [brand=" + brand + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
