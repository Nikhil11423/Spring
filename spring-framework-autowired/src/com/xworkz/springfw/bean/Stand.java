package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Stand {
	@Value("center stand")
	private String type;
	@Value("black")
	private String color;
	@Value("450.0")
	private double price;

	@Override
	public String toString() {
		return "Stand [type=" + type + ", color=" + color + ", price=" + price + "]";
	}

}
