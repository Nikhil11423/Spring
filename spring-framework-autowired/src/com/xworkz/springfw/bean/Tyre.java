package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	@Value("balck")
	private String color;
	@Value("tubeless")
	private String type;
	@Value("2000.0")
	private double price;

	@Override
	public String toString() {
		return "Tyre [color=" + color + ", type=" + type + ", price=" + price + "]";
	}

}
