package com.xworkz.spring.fw.bean.manslipper;

public class SlipperBean {
	private String companyName;
	private String color;
	private double price;
	private int size;

	public SlipperBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "companyName=" + companyName + ", color=" + color + ", price=" + price + ", size=" + size + "";
	}

}
