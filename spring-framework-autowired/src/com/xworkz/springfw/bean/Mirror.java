package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {
	@Value("black")
	private String color;
	@Value("150.0")
	private double price;
	@Value("convex mirror")
	private String mirrorType;

	@Override
	public String toString() {
		return "Mirror [color=" + color + ", price=" + price + ", mirrorType=" + mirrorType + "]";
	}

}
