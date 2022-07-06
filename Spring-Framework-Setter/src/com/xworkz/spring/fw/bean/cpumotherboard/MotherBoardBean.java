package com.xworkz.spring.fw.bean.cpumotherboard;

public class MotherBoardBean {
	private String name;
	private String processorType;
	private int noOfRamSlots;

	public MotherBoardBean() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public void setNoOfRamSlots(int noOfRamSlots) {
		this.noOfRamSlots = noOfRamSlots;
	}

	@Override
	public String toString() {
		return "name=" + name + ", processorType=" + processorType + ", noOfRamSlots=" + noOfRamSlots + "";
	}

}
