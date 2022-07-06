package com.xworkz.spring.fw.bean.bottlecap;

public class CapBean {

	private String color;
	private String typeOfMeterial;

	public CapBean(String color, String typeOfMeterial) {
		this.color = color;
		this.typeOfMeterial = typeOfMeterial;
	}

	public void closing() {
		System.out.println("cap is used to close the bottle");

	}

	@Override
	public String toString() {
		return "color=" + color + ", typeOfMeterial=" + typeOfMeterial + "";
	}

}
