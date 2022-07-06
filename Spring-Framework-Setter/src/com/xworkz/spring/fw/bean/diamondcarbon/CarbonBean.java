package com.xworkz.spring.fw.bean.diamondcarbon;

public class CarbonBean {

	private String typeOfCarbon;
	private String density;

	public CarbonBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param typeOfCarbon the typeOfCarbon to set
	 */
	public void setTypeOfCarbon(String typeOfCarbon) {
		this.typeOfCarbon = typeOfCarbon;
	}

	/**
	 * @param density the density to set
	 */
	public void setDensity(String density) {
		this.density = density;
	}

	@Override
	public String toString() {
		return "typeOfCarbon=" + typeOfCarbon + ", density=" + density + "";
	}

}
