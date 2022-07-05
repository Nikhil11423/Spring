package com.xworkz.spring.fw.bean.trainengine;

public class TrainBean {

	private String name;
	private String color;
	private int platFormNo;
	private EngineBean engineBean;

	public TrainBean() {
		System.out.println("create TrainBean");
	}

	public TrainBean(String name, String color, EngineBean engineBean) {
		this.name = name;
		this.color = color;
		this.engineBean = engineBean;
		System.out.println("calling name,color,engineBean parameter");
	}

	public void setPlatFormNo(int platFormNo) {
		this.platFormNo = platFormNo;
		System.out.println("adding property of platFormNo= " + this.platFormNo);
	}

	public void ticketIssue() {
		System.out.println("invoking ticketIssue method");
	}

	@Override
	public String toString() {
		return "TrainBean [name=" + name + ", color=" + color + ", platFormNo=" + platFormNo + ", " + engineBean + "]";
	}

}
