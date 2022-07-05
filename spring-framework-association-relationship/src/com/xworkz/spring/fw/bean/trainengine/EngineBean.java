package com.xworkz.spring.fw.bean.trainengine;

public class EngineBean {
	private String type;

	public EngineBean(String type) {
		this.type = type;
		System.out.println("create EngineBean");
	}

	public void compression() {
		System.out.println("engine function is compression");
	}

	@Override
	public String toString() {
		return "type=" + type + "";
	}

}
