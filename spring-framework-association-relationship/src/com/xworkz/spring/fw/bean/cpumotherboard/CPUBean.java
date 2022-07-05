package com.xworkz.spring.fw.bean.cpumotherboard;

public class CPUBean {
	private String modelNo;
	private String powerSupply;
	private String internalPort;
	private MotherBoardBean motherBoardBean;

	public CPUBean() {
		// TODO Auto-generated constructor stub
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public void setInternalPort(String internalPort) {
		this.internalPort = internalPort;
	}

	public void setMotherBoardBean(MotherBoardBean motherBoardBean) {
		this.motherBoardBean = motherBoardBean;
	}

	@Override
	public String toString() {
		return "CPUBean [modelNo=" + modelNo + ", powerSupply=" + powerSupply + ", internalPort=" + internalPort + ", "
				+ motherBoardBean + "]";
	}

}
