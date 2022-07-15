package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GearBox {
	@Value("parallel type")
	private String type;
	@Value("2500.0")
	private double price;
	@Value("ball bearing")
	private String bearingType;

	@Override
	public String toString() {
		return "GearBox [type=" + type + ", price=" + price + ", bearingType=" + bearingType + "]";
	}

}
