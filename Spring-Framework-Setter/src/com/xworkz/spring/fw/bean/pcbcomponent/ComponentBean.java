package com.xworkz.spring.fw.bean.pcbcomponent;

public class ComponentBean {

	private String componentName;
	private String componentSymbol;

	public ComponentBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param componentName the componentName to set
	 */
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	/**
	 * @param componentSymbol the componentSymbol to set
	 */
	public void setComponentSymbol(String componentSymbol) {
		this.componentSymbol = componentSymbol;
	}

	@Override
	public String toString() {
		return "componentName=" + componentName + ", componentSymbol=" + componentSymbol + "";
	}

}
