package com.xworkz.spring.fw.bean.solarsystemplanets;

public class PlanetsBean {

	private String name;
	private String temperature;

	public PlanetsBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "name=" + name + ", temperature=" + temperature + "";
	}

}
