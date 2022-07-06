package com.xworkz.spring.fw.bean.apartmentlift;

public class LiftBean {

	private String companyName;
	private int totalCapicityWieghtInKg;

	public LiftBean(String companyName, int totalCapicityWieghtInKg) {
		this.companyName = companyName;
		this.totalCapicityWieghtInKg = totalCapicityWieghtInKg;
	}

	@Override
	public String toString() {
		return "companyName=" + companyName + ", totalCapicityWieghtInKg=" + totalCapicityWieghtInKg + "";
	}

}
