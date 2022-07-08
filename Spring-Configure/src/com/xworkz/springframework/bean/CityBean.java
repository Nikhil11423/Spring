package com.xworkz.springframework.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@ComponentScan(basePackages = "com.xworkz.springframework")
@Component
@Getter
@Setter
public class CityBean {
	
	private String name;
	private String hobli;
	private String circleOffice;
	private String chairman;
	private String voiceChairman;
	private String policestation;
	private String taluk;
	private String dist;
	private Integer pincode;
	private Integer totalPanchaytimembers;
	private String  pdoName;
	private String  mlaName;
	private String  mpName;
	private boolean postOffice;
	private boolean govtHospital;
	@Override
	public String toString() {
		return "CityBean [name=" + name + ", hobli=" + hobli + ", circleOffice=" + circleOffice + ", chairman="
				+ chairman + ", voiceChairman=" + voiceChairman + ", policestation=" + policestation + ", taluk="
				+ taluk + ", dist=" + dist + ", pincode=" + pincode + ", totalPanchaytimembers=" + totalPanchaytimembers
				+ ", pdoName=" + pdoName + ", mlaName=" + mlaName + ", mpName=" + mpName + ", postOffice=" + postOffice
				+ ", govtHospital=" + govtHospital + "]";
	}
	}
