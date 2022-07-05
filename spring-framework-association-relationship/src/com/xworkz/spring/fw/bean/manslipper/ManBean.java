package com.xworkz.spring.fw.bean.manslipper;

public class ManBean {

	private String name;
	private char gender;
	private int age;
	private SlipperBean slipperBean;

	public ManBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param slipperBean the slipperBean to set
	 */
	public void setSlipperBean(SlipperBean slipperBean) {
		this.slipperBean = slipperBean;
	}

	@Override
	public String toString() {
		return "ManBean [name=" + name + ", gender=" + gender + ", age=" + age + ", " + slipperBean + "]";
	}

}
