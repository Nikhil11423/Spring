package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class BrakeShoe {

	@Value("NIKAVI")
	private String brand;
	@Value("350.0")
	private double price;
	@Value("corbon fibre")
	private String meterial;

	public void carryTheBrakeLining() {
		System.out.println("Brake shoes carry the brake lining inside brake drum systems");
	}

	@Override
	public String toString() {
		return "BrakeShoe [brand=" + brand + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
