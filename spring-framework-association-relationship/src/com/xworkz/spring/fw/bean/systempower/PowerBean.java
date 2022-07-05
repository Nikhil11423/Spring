package com.xworkz.spring.fw.bean.systempower;

public class PowerBean {

	private String typeOfPower;

	public PowerBean(String typeOfPower) {
		this.typeOfPower = typeOfPower;
	}

	@Override
	public String toString() {
		return "typeOfPower=" + typeOfPower + "";
	}

}
