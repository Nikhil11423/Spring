package com.xworkz.spring.fw.bean.shirtbutton;

public class ShirtBean {

	private String typeOfShirt;
	private double price;
	private String color;
	private ButtonBean buttonBean;

	public ShirtBean(String typeOfShirt, double price, String color, ButtonBean buttonBean) {
		this.typeOfShirt = typeOfShirt;
		this.price = price;
		this.color = color;
		this.buttonBean = buttonBean;
	}

	@Override
	public String toString() {
		return "ShirtBean [typeOfShirt=" + typeOfShirt + ", price=" + price + ", color=" + color + ", " + buttonBean
				+ "]";
	}

}
