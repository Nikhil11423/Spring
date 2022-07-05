package com.xworkz.spring.fw.bean.pcbcomponent;

public class PCBBean {
	private String typeOfPCB;
	private ComponentBean componentBean;

	public PCBBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param typeOfPCB the typeOfPCB to set
	 */
	public void setTypeOfPCB(String typeOfPCB) {
		this.typeOfPCB = typeOfPCB;
	}

	/**
	 * @param componentBean the componentBean to set
	 */
	public void setComponentBean(ComponentBean componentBean) {
		this.componentBean = componentBean;
	}

	@Override
	public String toString() {
		return "PCBBean [typeOfPCB=" + typeOfPCB + ", " + componentBean + "]";
	}

}
