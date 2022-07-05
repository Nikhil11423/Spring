package com.xworkz.spring.fw.bean.fishtail;

public class TailBean {
	private int totalTailShapes;
	private String tailName;

	public TailBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param totalTailShapes the totalTailShapes to set
	 */
	public void setTotalTailShapes(int totalTailShapes) {
		this.totalTailShapes = totalTailShapes;
	}

	/**
	 * @param tailName the tailName to set
	 */
	public void setTailName(String tailName) {
		this.tailName = tailName;
	}

	@Override
	public String toString() {
		return "totalTailShapes=" + totalTailShapes + ", tailName=" + tailName + "";
	}

}
