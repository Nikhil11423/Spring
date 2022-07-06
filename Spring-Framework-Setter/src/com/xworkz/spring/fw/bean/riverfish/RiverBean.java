package com.xworkz.spring.fw.bean.riverfish;

public class RiverBean {

	private String nameOfRiver;
	private String location;
	private FishBean fishBean;

	public RiverBean(String nameOfRiver, String location, FishBean fishBean) {
		this.nameOfRiver = nameOfRiver;
		this.location = location;
		this.fishBean = fishBean;
	}

	@Override
	public String toString() {
		return "RiverBean [nameOfRiver=" + nameOfRiver + ", location=" + location + ", " + fishBean + "]";
	}

}
