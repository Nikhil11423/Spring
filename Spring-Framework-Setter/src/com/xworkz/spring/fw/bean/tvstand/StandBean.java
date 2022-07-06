package com.xworkz.spring.fw.bean.tvstand;

public class StandBean {
	private String typeOfStand;
	private String color;

	public StandBean(String typeOfStand, String color) {
		this.typeOfStand = typeOfStand;
		this.color = color;
	}

	@Override
	public String toString() {
		return "typeOfStand=" + typeOfStand + ", color=" + color + "";
	}

}
