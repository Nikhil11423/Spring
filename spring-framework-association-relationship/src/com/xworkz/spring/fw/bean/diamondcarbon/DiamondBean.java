package com.xworkz.spring.fw.bean.diamondcarbon;

public class DiamondBean {

	private String structure;
	private String madeOf;
	private CarbonBean carbonBean;

	public DiamondBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param structure the structure to set
	 */
	public void setStructure(String structure) {
		this.structure = structure;
	}

	/**
	 * @param madeOf the madeOf to set
	 */
	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	/**
	 * @param carbonBean the carbonBean to set
	 */
	public void setCarbonBean(CarbonBean carbonBean) {
		this.carbonBean = carbonBean;
	}

	@Override
	public String toString() {
		return "DiamondBean [structure=" + structure + ", madeOf=" + madeOf + ", " + carbonBean + "]";
	}

}
