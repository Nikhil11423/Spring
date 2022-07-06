package com.xworkz.spring.fw.bean.bottlecap;

public class BottleBean {

	private String companyName;
	private String bottleColor;
	private int totalQuantityPerLtr;
	private CapBean capBean;

	public BottleBean(String companyName, String bottleColor, int totalQuantityPerLtr, CapBean capBean) {
		this.companyName = companyName;
		this.bottleColor = bottleColor;
		this.totalQuantityPerLtr = totalQuantityPerLtr;
		this.capBean = capBean;
	}

	@Override
	public String toString() {
		return "BottleBean [companyName=" + companyName + ", bottleColor=" + bottleColor + ", totalQuantityPerLtr="
				+ totalQuantityPerLtr + ", " + capBean + "]";
	}

}
