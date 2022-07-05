package com.xworkz.spring.fw.bean.shirtbutton;

public class ButtonBean {

	private String shapeOfButton;
	private String color;

	public ButtonBean(String shapeOfButton, String color) {
		this.shapeOfButton = shapeOfButton;
		this.color = color;
	}

	@Override
	public String toString() {
		return "shapeOfButton=" + shapeOfButton + ", color=" + color + "";
	}

}
