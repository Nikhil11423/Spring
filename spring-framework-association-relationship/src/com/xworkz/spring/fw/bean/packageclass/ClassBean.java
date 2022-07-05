package com.xworkz.spring.fw.bean.packageclass;

public class ClassBean {

	private String className;
	private int totalMethods;

	public ClassBean() {
		// TODO Auto-generated constructor stub
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setTotalMethods(int totalMethods) {
		this.totalMethods = totalMethods;
	}

	@Override
	public String toString() {
		return "className=" + className + ", totalMethods=" + totalMethods + "";
	}

}
