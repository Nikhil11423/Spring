package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Seat {
	@Value("black")
	private String color;
	@Value("true")
	private boolean waterProof;
	@Value("450.0")
	private double price;

	@Override
	public String toString() {
		return "Seat [color=" + color + ", waterProof=" + waterProof + ", price=" + price + "]";
	}
}
