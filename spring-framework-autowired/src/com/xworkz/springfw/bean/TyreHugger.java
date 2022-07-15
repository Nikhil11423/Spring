package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TyreHugger {

	@Value("medium")
	private String size;
	@Value("1325.0")
	private double price;
	@Value("850g")
	private String weight;

	@Override
	public String toString() {
		return "TyreHugger [size=" + size + ", price=" + price + ", weight=" + weight + "]";
	}

}
