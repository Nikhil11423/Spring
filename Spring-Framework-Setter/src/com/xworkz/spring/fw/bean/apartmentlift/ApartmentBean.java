package com.xworkz.spring.fw.bean.apartmentlift;

public class ApartmentBean {

	private String apartmentName;
	private int totalFlat;
	private LiftBean liftBean;

	public ApartmentBean(String  apartmentName, int totalFlat, LiftBean liftBean) {
		this. apartmentName =  apartmentName;
		this.totalFlat = totalFlat;
		this.liftBean = liftBean;
	}

	@Override
	public String toString() {
		return "ApartmentBean [aptName=" +  apartmentName + ", totalFlat=" + totalFlat + ", " + liftBean + "]";
	}

}
