package com.xworkz.spring.fw.bean.bodyblood;

public class BodyBean {

	private String bodyColor;
	private double weight;
	private BloodBean bloodBean;

	public BodyBean() {
	}

	/**
	 * @param bodyColor the bodyColor to set
	 */
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @param bloodBean the bloodBean to set
	 */
	public void setBloodBean(BloodBean bloodBean) {
		this.bloodBean = bloodBean;
	}

	@Override
	public String toString() {
		return "BodyBean [bodyColor=" + bodyColor + ", weight=" + weight + ", " + bloodBean + "]";
	}

}
