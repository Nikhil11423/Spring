package com.xworkz.spring.fw.bean.bodyblood;

public class BloodBean {

	private String bloodGroup;

	public BloodBean() {
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "bloodGroup=" + bloodGroup + "";
	}

}
