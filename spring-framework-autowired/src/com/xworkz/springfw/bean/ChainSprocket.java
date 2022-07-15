package com.xworkz.springfw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChainSprocket {
	@Value("428")
	private int chainSize;
	@Value("493.0")
	private double price;
	@Value("iron")
	private String meterial;

	@Override
	public String toString() {
		return "ChainSprocket [chainSize=" + chainSize + ", price=" + price + ", meterial=" + meterial + "]";
	}

}
