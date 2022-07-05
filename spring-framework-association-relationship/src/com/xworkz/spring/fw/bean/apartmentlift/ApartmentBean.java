package com.xworkz.spring.fw.bean.apartmentlift;

public class ApartmentBean {

	private String aptName;
	private int totalFlat;
	private LiftBean liftBean;

	public ApartmentBean(String aptName, int totalFlat, LiftBean liftBean) {
		this.aptName = aptName;
		this.totalFlat = totalFlat;
		this.liftBean = liftBean;
	}

	@Override
	public String toString() {
		return "ApartmentBean [aptName=" + aptName + ", totalFlat=" + totalFlat + ", " + liftBean + "]";
	}

}
