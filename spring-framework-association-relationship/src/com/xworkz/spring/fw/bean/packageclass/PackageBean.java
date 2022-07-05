package com.xworkz.spring.fw.bean.packageclass;

public class PackageBean {

	private String packageName;
	private ClassBean classBean;

	public PackageBean() {
		// TODO Auto-generated constructor stub
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public void setClassBean(ClassBean classBean) {
		this.classBean = classBean;
	}

	@Override
	public String toString() {
		return "PackageBean [packageName=" + packageName + ", " + classBean + "]";
	}

}
