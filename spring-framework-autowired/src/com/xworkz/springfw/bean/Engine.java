
package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value("v12 engine")
	private String company;
	@Value("12000")
	private String price;
	@Value("petrol")
	private String engineType;

	public Engine() {
		System.out.println("creating engine default constructor");
	}

	@Override
	public String toString() {
		return "company=" + company + ", price=" + price + ", engineType=" + engineType + "";
	}

}
