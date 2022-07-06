package com.xworkz.spring.fw.bean.tvstand;

public class TvBean {

	private String companyName;
	private double price;
	private StandBean standBean;

	public TvBean(String companyName, double price, StandBean standBean) {
		this.companyName = companyName;
		this.price = price;
		this.standBean = standBean;
	}

	@Override
	public String toString() {
		return "TvBean [companyName=" + companyName + ", price=" + price + ", " + standBean + "]";
	}

}
